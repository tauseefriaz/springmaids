package com.springmaid.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmaid.domain.ToDo;
import com.springmaid.domain.User;
import com.springmaid.service.ToDoService;
import com.springmaid.service.UserService;


/**
 * @author Setareh
 *
 */
@Controller
@RequestMapping("/userlist")
public class ToDoListController {

	static String username;
	@Autowired
	ToDoService toDoService;
	@Autowired
	UserService userService;
	
	/**
	 * @param user
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/listings" ,method=RequestMethod.GET)
	public String showAll(@ModelAttribute("userModel") User user, HttpServletRequest request, Model model)
	{
		
		System.out.println("starrrrrrrrrrrrr"+user.getUsername()+"");
		
		User finalUser = userService.getUserByUserName(this.username);
		System.out.println(finalUser.getUsername()+"iiiidddddd");
		
		request.setAttribute("todos", toDoService.findListsByUserID(finalUser.getUserID()));
		System.out.println(toDoService.findListsByUserID(finalUser.getUserID())+"   list by id");
		
		return "ShowListOfToDos";
	}
	
	
	
	
	/**
	 * @param user
	 * @param toDo
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/save" , method= RequestMethod.POST)
	public String saveNewToDo(@ModelAttribute("userModel")User user, @ModelAttribute("todoModel")ToDo toDo,HttpServletRequest request)
	{
		System.out.println(user.getUsername()+"userID");
		User finalUser = userService.getUserByUserName(this.username);
		System.out.println(finalUser.getUserID()+"finalUserID");
		toDo.setUserID(finalUser.getUserID());
		toDoService.save(toDo);
		
		request.setAttribute("todos", toDoService.findListsByUserID(finalUser.getUserID()));
		System.out.println(toDoService.findListsByUserID(finalUser.getUserID())+"   list by id");
		//System.out.println("");
		return "ShowListOfToDos";
	}
	
	/**
	 * @return
	 */
	@ModelAttribute("todoModel")
	public ToDo createModel() {
	    return new ToDo();
	}
	
	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/welcome" , method= RequestMethod.GET)
	public String welcome(@ModelAttribute("userModel") User user)
	{
		//model.addAttribute("userModel", user);
		this.username = user.getUsername();
		return "welcome";
	}
	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/add" , method= RequestMethod.GET)
	public String addNewTodo(@ModelAttribute("userModel") User user)
	{
		System.out.println(this.username+"userIDAddForm");
		
		return "addForm";
	}
}