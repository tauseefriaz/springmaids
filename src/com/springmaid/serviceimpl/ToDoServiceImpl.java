package com.springmaid.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmaid.domain.ToDo;
import com.springmaid.repository.ToDoRepository;
import com.springmaid.service.ToDoService;




/**
 * @author Setareh
 *
 */
@Service
@Transactional 
public class ToDoServiceImpl implements ToDoService{
	
	
	@Autowired
	ToDoRepository toDoRepository;
	
	 /* (non-Javadoc)
	 * @see com.springmaid.service.ToDoService#delete(int)
	 */
	@Override
	public void delete(int toDoID) {
		// TODO Auto-generated method stub
		 toDoRepository.delete(toDoID);
		
	}
/* (non-Javadoc)
 * @see com.springmaid.service.ToDoService#findListsByUserID(int)
 */
@Override
public ArrayList<ToDo> findListsByUserID(int userID) {
	// TODO Auto-generated method stub
	System.out.println("todo repository !!!!");
	return toDoRepository.findLists(userID);
}
	 /* (non-Javadoc)
	 * @see com.springmaid.service.ToDoService#save(com.springmaid.domain.ToDo)
	 */
	@Override
	public ToDo save(ToDo toDo) {
		// TODO Auto-generated method stub
		return toDoRepository.save(toDo);
	}

}
