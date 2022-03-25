package com.homeloan.jwt;

import java.io.Serializable;

public class LoginData implements Serializable{
	private String userName;
	private String password;
	
	//need default constructor for JSON parsing
	public LoginData() {
		super();
	}


	public LoginData(String userName, String password) {
		
		this.setUserName(userName);
		this.setPassword(password);
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
