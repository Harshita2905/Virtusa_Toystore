package com.toystore.app.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.toystore.app.model.User;
import com.toystore.app.repository.AmountRepository;

@RestController
//@RequestMapping("/version")
public class LoginController {

	Logger logger=LoggerFactory.getLogger(LoginController.class);
	
	
	@Autowired
	AmountRepository amountRepository;
	
	ModelAndView mView;
	

	
	//index page
	@GetMapping("/index")
	public ModelAndView getindex() {
		mView = new ModelAndView();
		mView.setViewName("index");
		logger.info("Index page opened");
		return mView;
	}
	//admin login
	
	
	@PostMapping("/indexdata")
	public ModelAndView indexdata(@ModelAttribute User admin) {
		 mView = new ModelAndView();
		String value =admin.getRole();
		String name = admin.getUsername();
		String password = admin.getPassword();
		
		switch (value){
		case "admin": 
			
			if((name.equals("Admin"))&& (password.equals("Admin@123"))) {
				logger.info("Admin loggedIn");
				mView.setViewName("redirect:/submissionlogin");
			}
				
		
			break;
		
		case "customer":
			if((name.equals("Customer"))&& (password.equals("Customer@123"))) {
				logger.info("Customer LoggedIn");
			mView.setViewName("redirect:/submissioncust");
		}
			break;
		
			
		default:
			logger.error("Login failed");
			mView.setViewName("redirect:/index");
			
			
		}
	
		return mView;
		
		
	}
	
	
	
	
	//redirect to admin page
			@PostMapping("/redirect")
			public ModelAndView redirect() {
				ModelAndView mView = new ModelAndView();
				mView.setViewName("redirect:/admin");
					return mView;
				}
			
			//redirect to customer page
			@PostMapping("/redirect1")
			public ModelAndView redirect1() {
				ModelAndView mView = new ModelAndView();
				mView.setViewName("redirect:/placeorder");
					return mView;
				}
						
		
			
			
			
			

			
			// ALL submissions

			//ADMIN LOGIN successfully
			@GetMapping("/submissionlogin")
			public ModelAndView submissionlogin() {
				ModelAndView mView = new ModelAndView();
				mView.setViewName("submissionlogin");
				return mView;
			}
			

			
			
			//CUSTOMER LOGIN successfully
			@GetMapping("/submissioncust")
			public ModelAndView submissioncust() {
				ModelAndView mView = new ModelAndView();
				mView.setViewName("submissioncust");
				return mView;
			}
			
			
}
