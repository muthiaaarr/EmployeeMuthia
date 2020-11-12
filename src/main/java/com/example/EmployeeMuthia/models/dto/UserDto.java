package com.example.EmployeeMuthia.models.dto;

import com.example.EmployeeMuthia.models.UserId;

public class UserDto {

	private UserId id;
	private String password;
	private Short status;
	
	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	public UserDto(UserId id, String password, Short status) {
		super();
		this.id = id;
		this.password = password;
		this.status = status;
	}

	public UserId getId() {
		return id;
	}

	public void setId(UserId id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}
	
	
	
}
