package com.toystore.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.toystore.app.model.Feedback;
import com.toystore.app.serviceImplementation.FeedbackServiceImplementation;
@RestController
public class FeedbackController {

	ModelAndView mView;
	@Autowired
	FeedbackServiceImplementation feedbackService;
	
	Logger logger=LoggerFactory.getLogger(FeedbackController.class);

	
	//add feedback
	
			@PostMapping("/feedback")
			public ModelAndView feedback(@ModelAttribute Feedback feedback) {
				mView = new ModelAndView();
				feedbackService.feedback(feedback);
				mView.setViewName("redirect:/index");
				return mView;
			}
			
			//view reviews
			@GetMapping("/reviews")
			public ModelAndView viewReviews() {
				mView= new ModelAndView();
				List<Feedback> feedbacks = feedbackService.viewfeedback();
				mView.addObject("feedbacks",feedbacks);
				mView.setViewName("reviews");
				logger.info("Viewing reviews");
				return mView;
			}
			
			//view feedbacks admin side
			@GetMapping("/viewfeedback")
			public ModelAndView viewfeedback() {
				mView= new ModelAndView();
				List<Feedback> feedbacks = feedbackService.viewfeedback();
				mView.addObject("feedbacks",feedbacks);
				mView.setViewName("feedback");
				logger.info("Product data view");
				return mView;
			}
			
			//delete feedback admin side
			@PostMapping("/deletefeedback/{fid}")
			public ModelAndView deletefeedback(@PathVariable int fid) {
				mView = new ModelAndView();
				feedbackService.deletefeedback(fid);
				logger.info("Feedback deleted successfully!!");
				mView.setViewName("redirect:/viewfeedback");
				return mView;
				
			}
			
}
