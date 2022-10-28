package com.toystore.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.toystore.app.model.Amount;

public interface AmountRepository extends JpaRepository<Amount, Integer> {

	
	@Query(value = "SELECT SUM(amount) FROM amount", nativeQuery = true)
	public float totalamt();

}
