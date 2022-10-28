package com.toystore.app.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toystore.app.model.Products;
import com.toystore.app.repository.ProductRepository;
import com.toystore.app.service.ProductService;
@Service
public class ProductServiceImplementation implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	//add
		public Products addproduct(Products products) {
			

			return productRepository.save(products);
		}
		
		//delete
		public void deleteproduct(int id) {
			productRepository.deleteById(id);
			
		}
		

			public void deleterow(int productid) {
				productRepository.deleteById(productid);
				
			}
		
		
		//view
		public List<Products> viewProducts() {
			return productRepository.findAll();
			
		}
		public Optional<Products> getdata(int productid) {

			return	productRepository.findById(productid);
					
		}
		
		

		public Products get1product(int productid) {
			return productRepository.findById(productid).orElse(null);
			
		}
}
