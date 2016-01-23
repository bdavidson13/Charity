package com.faux.Models;

public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	private int userId;
	
	public User(){
		this.firstName = null;
		this.lastName = null;
		this.email = null;
		this.userName = null;
		this.password = null;
		this.userId = -1;
	}
	
	public User(String firstName, String lastName, String email, String userName, String password, int userId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.userId = userId;
	}
	public User(String firstName, String lastName, String email, String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
}
