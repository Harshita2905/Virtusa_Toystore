package com.toystore.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toystore.app.model.Feedback;
@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

}
