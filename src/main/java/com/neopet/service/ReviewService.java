package com.neopet.service;

import java.util.List;

import com.neopet.exception.ProductException;
import com.neopet.modal.Review;
import com.neopet.modal.User;
import com.neopet.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
