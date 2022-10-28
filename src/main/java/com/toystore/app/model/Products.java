package com.toystore.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity
@Component
public class Products {

	@Id
	@GeneratedValue
	int productid;
	String productname;
	String producttype;
	int productquantity;
	float productprice;
	
	
	public Products() {
		super();
	
	}
	public Products(int productid, String productname, String producttype, int productquantity, float productprice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.producttype = producttype;
		this.productquantity = productquantity;
		this.productprice = productprice;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProducttype() {
		return producttype;
	}
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}
	public int getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}
	public float getProductprice() {
		return productprice;
	}
	public void setProductprice(float productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "Products [productid=" + productid + ", productname=" + productname + ", producttype=" + producttype
				+ ", productquantity=" + productquantity + ", productprice=" + productprice + "]";
	}
	
	
	}
