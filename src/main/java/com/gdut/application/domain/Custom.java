package com.gdut.application.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Custom {
	
	@Id
	private int id;
	private int customId;
	private String password;
	private String customName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getcustomId() {
		return customId;
	}
	public void setcustomId(int customId) {
		this.customId = customId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getcustomName() {
		return customName;
	}
	public void setcustomName(String customName) {
		this.customName = customName;
	}
	public Custom(int id, int customId, String password, String customName) {
		super();
		this.id = id;
		this.customId = customId;
		this.password = password;
		this.customName = customName;
	}
	public Custom() {
		super();
	}
	@Override
	public String toString() {
		return "Custom [Id=" + id + ", customId=" + customId + ", Password=" + password + ", customName=" + customName
				+ "]";
	} 
	
	
	
}
