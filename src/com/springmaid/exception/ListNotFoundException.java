package com.springmaid.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;


/**
 * @author Samrawit
 *
 */
@ControllerAdvice 
public class ListNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String message = "ToDo List not found for this user";
	
 	public ListNotFoundException() {}
	
	/**
	 * @param userName
	 * @param message
	 */
	public ListNotFoundException(String userName, String message) {
		this.userName = userName;

		if (message != null) 
			this.message = message;
		
	}
	
	/**
	 * @return
	 */
	public String getFullMessage() {
		return (message + userName);
	}
	
	/**
	 * @return
	 */
	public String getUserName() {
		return userName;
	}	
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#getLocalizedMessage()
	 */
	@Override
	public String getLocalizedMessage() {
		// TODO Auto-generated method stub
		return super.getLocalizedMessage();
	}


}
