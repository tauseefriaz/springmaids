package com.springmaid.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springmaid.domain.ToDo;
import com.springmaid.domain.User;

/**
 * @author Setareh
 *
 */
@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Integer> {
	
	
	
	
	

	 /**
	 * @param userID
	 * @return
	 */
	@Query(value = "select todo from ToDo todo where todo.userID = :userID")
	    ArrayList<ToDo> findLists(@Param("userID") int userID);
	          
	
	

}
