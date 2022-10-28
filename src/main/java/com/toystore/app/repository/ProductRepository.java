package com.toystore.app.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.toystore.app.model.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {

	

	

}
