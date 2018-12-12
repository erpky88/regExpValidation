package com.pack.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginModel {
	@NotBlank
	private  String  username;
	
	@Size(min=6, max=12)
	private  String  password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
