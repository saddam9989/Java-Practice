package com.homeloan.jwt;

import java.io.Serializable;
//Token entity is used in the authentication controller
public class TokenEntity implements Serializable{
	
	private  final String token;

	public TokenEntity(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}
	
	

}
