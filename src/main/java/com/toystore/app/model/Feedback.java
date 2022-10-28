package com.toystore.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	
	@Id
	int fid;
	String name;
	String mail;
	String message;
	public Feedback() {
		super();

	}
	public Feedback(int fid, String mail, String name, String message) {
		super();
		this.fid = fid;
		this.mail = mail;
		this.name = name;
		this.message = message;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
