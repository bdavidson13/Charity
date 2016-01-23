package com.UnderTheSettingSun.Vincent.Models;

public class UserModel {
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	
	//Constructor
	
	public UserModel(){
		this.setFirstName("");
		this.setLastName("");
		this.setEmail("");
		this.setUserName("");
		this.setPassword("");
	}
	public UserModel(String p_firstName,String p_lastName,String p_email
			,String p_userName, String p_password){
		this.setFirstName(p_firstName);
		this.setLastName(p_lastName);
		this.setEmail(p_email);
		this.setUserName(p_userName);
		this.setPassword(p_password);
	}
	
	
	//GETTERS AND SETTERS
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
}
