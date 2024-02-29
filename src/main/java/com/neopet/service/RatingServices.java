package com.neopet.service;

import java.util.List;

import com.neopet.exception.ProductException;
import com.neopet.modal.Rating;
import com.neopet.modal.User;
import com.neopet.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
