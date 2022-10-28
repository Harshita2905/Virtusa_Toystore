package com.toystore.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class User {

	@Id
	int aid;
	String role;
	String username;
	String password;
	public User() {
		super();
		
	}
	public User(int aid, String role, String username, String password) {
		super();
		this.aid = aid;
		this.role = role;
		this.username = username;
		this.password = password;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
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
