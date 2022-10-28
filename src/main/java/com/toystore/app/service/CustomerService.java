package com.toystore.app.service;

import java.util.List;

import com.toystore.app.model.Cart;
import com.toystore.app.model.CustomerDetails;
import com.toystore.app.model.Feedback;
import com.toystore.app.model.Products;

public interface CustomerService {

	
	public List<Products> placeorder();
	
	public Cart addToCart(int productid, int quantity);
	
	
}
