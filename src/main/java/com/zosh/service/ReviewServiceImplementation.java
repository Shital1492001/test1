package com.zosh.service;

import org.springframework.stereotype.Service;

import com.zosh.modal.Review;
import com.zosh.modal.User;
import com.zosh.repository.ReviewRepository;

@Service
public class ReviewServiceImplementation implements ReviewService {
	
	private ReviewRepository reviewRepository;
	
	public ReviewServiceImplementation(ReviewRepository reviewRepository) {
		this.reviewRepository=reviewRepository;
	}

	@Override
	public Review createReview(Review req,User user) {
		// TODO Auto-generated method stub
		return reviewRepository.save(req);
	}

}
