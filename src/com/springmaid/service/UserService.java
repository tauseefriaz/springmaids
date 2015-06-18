package com.springmaid.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.springmaid.domain.User;



public interface UserService {

	public User addUser(User user);
	public void deleteUser(int userID);
	public ArrayList<User> findAll();
	public User findOne(int userID);
	public User getUserByUserName(String username);
	public User disableUser(int userID);
	public User enableUser(int UserID);
	
}
