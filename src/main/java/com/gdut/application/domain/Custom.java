package com.gdut.application.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Custom {
	
	@Id
	private int Id;
	private int CustomNum;
	private String Password;
	private String UserName;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getCustomNum() {
		return CustomNum;
	}
	public void setCustomNum(int customNum) {
		CustomNum = customNum;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public Custom(int id, int customNum, String password, String userName) {
		super();
		Id = id;
		CustomNum = customNum;
		Password = password;
		UserName = userName;
	}
	public Custom() {
		super();
	} 
	
	
}
