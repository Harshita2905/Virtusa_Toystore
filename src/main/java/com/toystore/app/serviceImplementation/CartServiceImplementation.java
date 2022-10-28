package com.toystore.app.serviceImplementation;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lowagie.text.DocumentException;
import com.toystore.app.model.Amount;
import com.toystore.app.model.Cart;
import com.toystore.app.model.CustomerDetails;
import com.toystore.app.model.PDFExporter;
import com.toystore.app.model.Products;
import com.toystore.app.repository.AmountRepository;
import com.toystore.app.repository.CartRepository;
import com.toystore.app.repository.CustomerDetailsRepository;
import com.toystore.app.repository.ProductRepository;
import com.toystore.app.service.CartService;
@Service
public class CartServiceImplementation implements CartService {
	
	ModelAndView mView;
	
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	CustomerDetailsRepository cDetailsRepository;
	
	@Autowired
	AmountRepository amountRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	
		public List<Cart> getdata() {
				
				return cartRepository.findAll();
			}
		
		public void deletecartrow(int cid) {
			cartRepository.deleteById(cid);
			
		}
		
		public String addcustomer(CustomerDetails cDetails) {
			CustomerDetails details= cDetailsRepository.save(cDetails);
			return details.getUpi();
			
		}
		
		public void computeAmount(float amt,float bagtotal1) {
			float newamt = amt+bagtotal1;
			Amount amount= new Amount(newamt);
			amountRepository.save(amount);
		
		}
		
				public void logout() {
					cartRepository.logout();
					
				}

				public List<Cart> listAll() {
					return cartRepository.findAll();		
					
						
				}
				
}
