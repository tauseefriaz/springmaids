package com.springmaid.serviceimpl;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmaid.domain.User;
import com.springmaid.repository.UserRepository;
import com.springmaid.service.UserService;

/**
 * @author Setareh
 *
 */
@Service
@Transactional 
public class UserServiceImpl implements UserService{
	
	/**
	 * 
	 */
	@Autowired
	private UserRepository userRepository;
	
	/* (non-Javadoc)
	 * @see com.springmaid.service.UserService#addUser(com.springmaid.domain.User)
	 */
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		
		
		return userRepository.save(user);
	}
	/* (non-Javadoc)
	 * @see com.springmaid.service.UserService#deleteUser(int)
	 */
	@Override
	public void deleteUser(int userID) {
		// TODO Auto-generated method stub
		userRepository.delete(userID);
	}
	/* (non-Javadoc)
	 * @see com.springmaid.service.UserService#findAll()
	 */
	@Override
	public ArrayList<User> findAll() {
		// TODO Auto-generated method stub
		return (ArrayList<User>) userRepository.findAll();
	}
	/* (non-Javadoc)
	 * @see com.springmaid.service.UserService#findOne(int)
	 */
	@Override
	public User findOne(int userID) {
		// TODO Auto-generated method stub
		System.out.println(userID+"xxxxxxxxx");
		return userRepository.findOne(userID);
	}
	@Override
	public User getUserByUserName(String username) {
		// TODO Auto-generated method stub
		System.out.println(username+"getUserService");
		System.out.println( userRepository.getUserByUserName(username)+"IM hereeeeeee");
		return userRepository.getUserByUserName(username);
	}
	
	

	/* (non-Javadoc)
	 * @see com.springmaid.service.UserService#disableUser(int)
	 */
	@Override
	public User disableUser(int userID){
		User user = userRepository.findOne(userID);
		user.setStatus(false);
		return user;
	}
	
	/* (non-Javadoc)
	 * @see com.springmaid.service.UserService#enableUser(int)
	 */
	@Override
	public User enableUser(int userID){
		User user = userRepository.findOne(userID);
		user.setStatus(true);
		return user;
	}
	 

}
