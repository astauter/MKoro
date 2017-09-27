package com.MKoro.entity;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	private String username;
	private String email;
	private String password;
	private String id;
	
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", password=" + password + ", id=" + id + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

}
