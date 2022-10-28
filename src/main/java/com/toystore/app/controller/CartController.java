package com.toystore.app.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lowagie.text.DocumentException;
import com.toystore.app.model.Amount;
import com.toystore.app.model.Cart;
import com.toystore.app.model.CustomerDetails;
import com.toystore.app.model.PDFExporter;
import com.toystore.app.repository.CartRepository;
import com.toystore.app.service.CartService;
@RestController
public class CartController {

	ModelAndView mView;
	
	@Autowired
	CartService cartService;
	
	@Autowired
	CartRepository cartRepository;
	
	Logger logger=LoggerFactory.getLogger(CartController.class);
	
	
	static float bagtotal1;
	//go to viewBag and bag total
	@RequestMapping("/viewbag")
	public ModelAndView viewbag() {
		mView = new ModelAndView();
		
		List<Cart> products = cartService.getdata();
		mView.addObject("products", products);
		bagtotal1 = cartRepository.computetotal();
		

		mView.addObject("stotal", bagtotal1);
		mView.setViewName("ViewBag");
		logger.info("List of cart products displayed");
		return mView;
	}

	
	//delete cart data on viewbg page
			@PostMapping("/deletecartrow/{cid}")
			public ModelAndView deletecartrow(@PathVariable int cid) {
				mView = new ModelAndView();
				cartService.deletecartrow(cid);
				mView.setViewName("redirect:/viewbag");
				logger.info("Product deleted from cart");
				return mView;
			}

			
			//enter customer details
			@GetMapping("/userdetails")
			public ModelAndView openpage() {
				mView = new ModelAndView();
				mView.setViewName("customerdetails");
				return mView;
			}
			
			String upi;
			
			
			@PostMapping("/userdetails")
			public ModelAndView addcustomer(@ModelAttribute CustomerDetails cDetails) {
				mView = new ModelAndView();
				cartService.addcustomer(cDetails);
				upi=cDetails.getUpi();
				mView.setViewName("redirect:/payment");
				logger.info("customer details added successfully");
				return mView;
			}
			//open payment page
			@GetMapping("/payment")
			public ModelAndView payment() {
				mView = new ModelAndView();
				
				mView.addObject("bagtotal1", bagtotal1);
				mView.addObject("upi", upi);
				
				mView.setViewName("payment");
				return mView;
			}
			@PostMapping("/payment")
			public ModelAndView gotoThankyou(@ModelAttribute Amount amount) {
				mView = new ModelAndView();
				float amt = amount.getAmount();
				cartService.computeAmount(amt,bagtotal1);
				logger.info("Payment Successful");
				mView.setViewName("redirect:/thankyou");
				return mView;
			}
			
			//open thank you page		
			@GetMapping("/thankyou")
			public ModelAndView thankyou() {
				mView = new ModelAndView();
				mView.setViewName("Thankyou");
				return mView;
			}
			
			//logout for truncate table
			//export to pdf
			
			
			@PostMapping("/thankyou")
			public ModelAndView export(HttpServletResponse response) throws DocumentException, IOException {
				mView = new ModelAndView();
				response.setContentType("application/pdf");
				 DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
			     String currentDateTime = dateFormatter.format(new Date());
				String headerKey = "content-Disposition";
				String headerValue = "attachment; filename=users_" + currentDateTime + ".pdf";
				response.setHeader(headerKey, headerValue);
				List<Cart> cartProductst = cartService.listAll();
				 PDFExporter exporter = new PDFExporter(cartProductst);
			        exporter.export(response,bagtotal1,upi);
			        cartService.logout();
				mView.setViewName("Thankyou");
				return mView;
			}
			
}
