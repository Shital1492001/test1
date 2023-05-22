package com.zosh.service;

import org.springframework.stereotype.Service;

import com.zosh.modal.Rating;
import com.zosh.modal.User;
import com.zosh.repository.RatingRepository;

@Service
public class RatingServiceImplementation implements RatingServices{
	
	private RatingRepository ratingRepository;
	
	public RatingServiceImplementation() {
		this.ratingRepository=ratingRepository;
	}

	@Override
	public Rating createRating(Rating req,User user) {
		
		return ratingRepository.save(req);
	}
	
	

}
