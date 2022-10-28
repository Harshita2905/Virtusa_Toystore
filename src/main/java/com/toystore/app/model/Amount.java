package com.toystore.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Amount {

	@Id
	int aid;
	float amount;
	public Amount() {
		super();
		
	}
	public Amount(int aid, float amount) {
		super();
		this.aid = aid;
		this.amount = amount;
	}
	
	public Amount(float amount) {
		super();
		this.amount = amount;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
	
}
