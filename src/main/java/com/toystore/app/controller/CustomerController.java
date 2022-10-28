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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lowagie.text.DocumentException;
import com.toystore.app.model.Amount;
import com.toystore.app.model.Cart;
import com.toystore.app.model.CustomerDetails;
import com.toystore.app.model.Feedback;
import com.toystore.app.model.PDFExporter;
import com.toystore.app.model.Products;
import com.toystore.app.repository.CartRepository;
import com.toystore.app.serviceImplementation.CustomerServiceImplementation;


@RestController
//@RequestMapping("/version/")
public class CustomerController {
	
	
		ModelAndView mView;
		@Autowired
		CustomerServiceImplementation customerService;
		
		@Autowired
		CartRepository cartRepository;
	
		Logger logger=LoggerFactory.getLogger(CustomerController.class);
	
		
		//customer main page view products
		@GetMapping("/placeorder")
		public ModelAndView placeorder() {
			mView = new ModelAndView();
			List<Products> products=customerService.placeorder();
			mView.addObject("products", products);
			mView.setViewName("customer");
			return mView;
		}
		

		@PostMapping("/placeorder")
		public ModelAndView addToCart(@RequestParam int productid,@RequestParam int quantity) {
			
			
			mView = new ModelAndView();
			customerService.addToCart(productid,quantity);
			
			mView.setViewName("redirect:/placeorder");
			logger.info("product added in cart");
			return mView;
		}
		
		
	
		
		
		
	
		
		
		
}
