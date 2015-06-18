package com.springmaid.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.springmaid.domain.ToDo;


public interface ToDoService {
	
	public ArrayList<ToDo> findListsByUserID(int userID);
	public ToDo save(ToDo toDo);
	public void delete(int toDoID);
	

}
