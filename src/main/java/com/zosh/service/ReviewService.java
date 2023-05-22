package com.zosh.service;

import java.util.List;

import com.zosh.modal.Review;
import com.zosh.modal.User;

public interface ReviewService {

	public Review createReview(Review req,User user);
	
	public List<Review> getAllReview(Long productId);
	
	
}
