package com.toystore.app.service;

import java.util.List;


import com.toystore.app.model.Cart;
import com.toystore.app.model.CustomerDetails;

public interface CartService {

	

	public List<Cart> getdata();
	public void deletecartrow(int cid);
	public String addcustomer(CustomerDetails cDetails);
	public void computeAmount(float amt,float bagtotal1);
	public void logout();
	public List<Cart> listAll();



}
