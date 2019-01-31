package com.poc.java.spring.usermanagement.application.vo;

import java.io.Serializable;

public class UserVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4000795617736415557L;

	private String id;
	private String guid;
	private String title;
	private String firstName;
	private String lastName;
	private String fullName;
	private String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CLASS_NAME=UserVO [ id=\"");
		builder.append(id);
		builder.append("\", guid=\"");
		builder.append(guid);
		builder.append("\", title=\"");
		builder.append(title);
		builder.append("\", firstName=\"");
		builder.append(firstName);
		builder.append("\", lastName=\"");
		builder.append(lastName);
		builder.append("\", fullName=\"");
		builder.append(fullName);
		builder.append("\", email=\"");
		builder.append(email);
		builder.append("\" ]");
		return builder.toString();
	}


	
}
