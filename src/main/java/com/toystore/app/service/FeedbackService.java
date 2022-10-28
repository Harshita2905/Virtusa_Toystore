package com.toystore.app.service;

import java.util.List;

import com.toystore.app.model.Feedback;

public interface FeedbackService {
	public void feedback(Feedback feedback);
	public List<Feedback> viewReviews();
	
	public List<Feedback> viewfeedback();
	public void deletefeedback(int fid);
}
