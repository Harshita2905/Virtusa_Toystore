package com.toystore.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.toystore.app.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {


	
	@Query(value = "SELECT SUM(cprice) FROM cart", nativeQuery = true)
    
	public float computetotal();

	@Modifying
	@Transactional
	@Query(value = "truncate table cart",nativeQuery = true)
            
	public void logout();
}
