package com.nulltech.eLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nulltech.eLibrary.model.Feedback;

public interface FeedBackTrackRepository extends JpaRepository<Feedback, Long>
{

}
