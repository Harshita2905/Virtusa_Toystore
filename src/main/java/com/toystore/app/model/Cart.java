package com.toystore.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	int cid;
	String cname;
	String ctype;
	int quantity;
	float cprice;
	public Cart() {
		super();

	}
	
	
	public Cart(String cname, String ctype, int quantity, float cprice) {
		super();
		this.cname = cname;
		this.ctype = ctype;
		this.quantity = quantity;
		this.cprice = cprice;
	}


	public Cart(int cid, String cname, String ctype, int quantity, float cprice) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ctype = ctype;
		this.quantity = quantity;
		this.cprice = cprice;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getCprice() {
		return cprice;
	}
	public void setCprice(float cprice) {
		this.cprice = cprice;
	}
	
	
}
