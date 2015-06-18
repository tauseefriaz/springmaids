 package com.springmaid.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmaid.domain.User;
import com.springmaid.service.UserService;


/**
 * @author lakshmi
 *
 */
@Controller 
@RequestMapping("/admin")
public class AdministratorController {

	/**
	 * 
	 */
	@Autowired
	UserService userservice;
	
	/**
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping({"/allusers"})
	public String ShowUserDetails(Model model, HttpServletRequest request){
		request.setAttribute("users", userservice.findAll());
		return "ShowAllUsers";
	}
	/**
	 * @param status
	 * @param username
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody User setStatus(@RequestBody int status , @RequestBody String username)
	{
		System.out.println("restful");
		User finalUser = userservice.getUserByUserName(username);
		if(status==0)
		{
			return userservice.enableUser(finalUser.getUserID());
		}
		else 
			return userservice.disableUser(finalUser.getUserID());
		
	}
	

}
