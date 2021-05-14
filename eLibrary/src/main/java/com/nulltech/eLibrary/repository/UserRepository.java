package com.nulltech.eLibrary.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nulltech.eLibrary.model.User;

public interface UserRepository extends JpaRepository<User, Long> 
{
	Optional <User> findByEmailId(String emailId); 
}
