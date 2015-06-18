package com.springmaid.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springmaid.domain.ToDo;
import com.springmaid.domain.User;
import com.springmaid.service.UserService;


/**
 * @author samrawit
 *
 */
@Controller

public class UserController {

	
	@Autowired
	UserService userService;
	
	/**
	 * @param user
	 * @return
	 */
	@RequestMapping({"/login"})
	public String login( User user) {
		
 		return "Login";
	}
	
	/**
	 * @return
	 */
	@ModelAttribute("userModel")
	public User createModel() {
	    return new User();
	}
	
	/**
	 * @param user
	 * @param model
	 * @param request
	 * @param response
	 * @param redirectAttributes
	 * @param result
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	@RequestMapping(value={"/login"} , method = RequestMethod.POST)
	public String goToList(@ModelAttribute("userModel") User user,Model model,HttpServletRequest request,
			HttpServletResponse response,RedirectAttributes redirectAttributes, BindingResult result) throws ServletException, IOException
	{
		if(result.hasErrors())
		{
			return "login";
		}
		redirectAttributes.addFlashAttribute("userModel",user);
		System.out.println("vvvvv"+user.getUsername());
		User finalUser = userService.getUserByUserName(user.getUsername());
		System.out.println("typeee"+finalUser.getType());
		if(finalUser.getType()==0){
		return "redirect:/userlist/welcome";
		}
		else return "redirect:/admin/allusers";
	}
	
	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(Model model) {
 
		model.addAttribute("error", "true");
		return "Login";
 
	}
 
	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(Model model) {
 		return "redirect:/login";
 	}

	/**
	 * @return
	 */
	@RequestMapping(value = {"/register"})
	public String register() {
 		return "Register";
	}
	
	/**
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/register" ,  method = RequestMethod.POST )
	public String register(@ModelAttribute("userModel") @Valid User user , BindingResult result)
	{
		
		System.out.println("staarrrrrrrrrrrr");
		if(result.hasErrors())
		{
			return "Register";
		}
		userService.addUser(user);
		System.out.println("ssaaaaaammmmmmmmmmmm");
		return "Login";
	}
	
}
