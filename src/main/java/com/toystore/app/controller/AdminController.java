package com.toystore.app.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.toystore.app.model.AdminWork;
import com.toystore.app.model.Products;
import com.toystore.app.repository.AmountRepository;


@RestController
public class AdminController {

	Logger logger=LoggerFactory.getLogger(AdminController.class);

	
	
	
	@Autowired
	AmountRepository amountRepository;
	
	Products products;
	ModelAndView mView;
	
	
	@PostMapping("/selected")
	public ModelAndView selected(@ModelAttribute AdminWork aWork) {
		mView = new ModelAndView();
		
		String selected = aWork.getSelected();
		
		
		switch (selected) {
		case "add": {
			logger.info("ProductAdd.jsp opened");
			mView.setViewName("redirect:/addproduct");
		}
		break;
		
		case "delete": {
			logger.info("ProductDelete.jsp opened");
					mView.setViewName("redirect:/deleteproduct");
				}
				break;
				
		case "update": {
			logger.info("ProductUpdate.jsp opened");
			mView.setViewName("redirect:/updateproduct");
		}
		break;
		
		case "view": {
			logger.info("ProductView.jsp opened");
			mView.setViewName("redirect:/viewdata");
		}
		break;
		
		case "viewfeedback": {
			logger.info("feedback.jsp opened");
			mView.setViewName("redirect:/viewfeedback");
		}
		break;
		
		case "logout": {
					logger.info("redirected to index page");
					mView.setViewName("redirect:/index");
				}
				break;
		default:
			mView.setViewName("redirect:/WelcomeAdmin");
		}
		return mView;
 	}
	
	
	
	float amount;
	@GetMapping("/admin")
	public ModelAndView admin() {
		ModelAndView mView = new ModelAndView();
		amount = amountRepository.totalamt();
		mView.addObject("amount", amount);
		mView.setViewName("WelcomeAdmin");
		
		return mView;
	}
	

}
