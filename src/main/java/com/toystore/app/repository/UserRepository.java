package com.toystore.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toystore.app.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	

}
