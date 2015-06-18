package com.springmaid.domain;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Setareh
 *
 */
@Entity
public class User {
    
	
	@Column(name="username" , unique=true)
	@NotEmpty
	@Size(min=4 , max=20 , message="{Size.user.username.validation}")
	
	private String username;
	@NotEmpty
	@Column(name="name")
	private String name;
	@NotEmpty
	@Size(min=4 , max=20 , message="{Size.user.password.validation}")
	@Column(name="password")
	private String password;
	@NotEmpty
	@Column(name="phone")
	private String phone;
	@NotEmpty
	@Column(name="email")
	private String email;
	@Column(name="status")
	private boolean status;
	@Column(name="type")
	private int type;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userID")
	private int userID;
	
	
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
	

	
	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	
	
}
