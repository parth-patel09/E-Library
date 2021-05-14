package com.nulltech.eLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nulltech.eLibrary.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long>
{

}
