package com.gdut.application.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Admin {
	
	private String username;
	private String password;
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Admin() {
		super();
	}
	
	
}
