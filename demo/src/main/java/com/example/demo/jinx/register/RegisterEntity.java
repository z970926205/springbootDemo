package com.example.demo.jinx.register;

import com.example.demo.jinx.general.BaseEntity;

public class RegisterEntity{
	private Integer id;
	private String userName;
	private String password;
	private String creator;
	public RegisterEntity() {
		super();
	}
	
	public RegisterEntity(Integer id, String userName, String password,
			String creator) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.creator = creator;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
}
