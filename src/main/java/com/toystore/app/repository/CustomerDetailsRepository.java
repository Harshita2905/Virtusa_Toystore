package com.toystore.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toystore.app.model.CustomerDetails;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Integer> {

}
