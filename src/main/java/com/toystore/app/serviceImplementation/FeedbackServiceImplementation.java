package com.toystore.app.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toystore.app.model.Feedback;
import com.toystore.app.repository.FeedbackRepository;
import com.toystore.app.service.FeedbackService;
@Service
public class FeedbackServiceImplementation implements FeedbackService {
	
	@Autowired
	FeedbackRepository feedbackRepository;

public void feedback(Feedback feedback) {
		
		feedbackRepository.save(feedback);
	}

	public List<Feedback> viewReviews() {
		
		return feedbackRepository.findAll();
	}
public List<Feedback> viewfeedback() {
		
		return feedbackRepository.findAll();
	}

	public void deletefeedback(int fid) {
		feedbackRepository.deleteById(fid);
		
	}
}
