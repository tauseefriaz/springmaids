package com.springmaid.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Setareh
 *
 */
@Entity
public class ToDo {
	
	@NotEmpty
	@Column(name="title")
	private String title;
	@NotEmpty
	@Column(name="description")
	private String description;
	@Column(name="timeDate")
	private Integer timeDate;
	@Column(name="userid")
	private Integer userID;
	@Column(name="status")
	private boolean status;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int toDoID;
	

	public int getToDoID() {
		return toDoID;
	}
	public void setToDoID(int toDoID) {
		this.toDoID = toDoID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getTimeDate() {
		return timeDate;
	}
	public void setTimeDate(Integer timeDate) {
		this.timeDate = timeDate;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	


}
