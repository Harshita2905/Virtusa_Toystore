package com.toystore.app.service;

import java.util.List;
import java.util.Optional;

import com.toystore.app.model.Products;

public interface ProductService {
	public Products addproduct(Products products);
	public void deleteproduct(int id);
	public void deleterow(int productid);
	public List<Products> viewProducts();
	public Optional<Products> getdata(int productid);
	public Products get1product(int productid);

}
