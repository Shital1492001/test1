package com.neopet.service;

import com.neopet.exception.ProductException;
import com.neopet.modal.Cart;
import com.neopet.modal.CartItem;
import com.neopet.modal.User;
import com.neopet.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
