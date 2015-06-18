package com.springmaid.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;






import com.springmaid.domain.User;

/**
 * @author Setareh
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

	
	
	
	 /**
	 * @param username
	 * @return
	 */
	@Query(value = "select user from User user where user.username = :username")
	    User getUserByUserName(@Param("username") String username);
	          
	 
	 
}
