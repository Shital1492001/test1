package com.neopet.service;

import java.util.List;

import com.neopet.exception.UserException;
import com.neopet.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
