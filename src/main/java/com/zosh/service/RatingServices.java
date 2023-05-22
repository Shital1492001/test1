package com.zosh.service;

import java.util.List;

import com.zosh.modal.Rating;
import com.zosh.modal.User;

public interface RatingServices {
	
	public Rating createRating(Rating req,User user);
	
	public List<Rating> getProductsRating(Long productId);

}
