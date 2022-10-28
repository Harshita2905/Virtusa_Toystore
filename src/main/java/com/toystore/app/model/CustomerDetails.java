package com.toystore.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CustomerDetails {

	@Id
	int cid;
	String name;
	long phno;
	String upi;
	public CustomerDetails() {
		super();

	}
	public CustomerDetails(int cid, String name, long phno, String upi) {
		super();
		this.cid = cid;
		this.name = name;
		this.phno = phno;
		this.upi = upi;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getUpi() {
		return upi;
	}
	public void setUpi(String upi) {
		this.upi = upi;
	}
	
}
