package com.nulltech.eLibrary.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nulltech.eLibrary.dto.UserDTO;
import com.nulltech.eLibrary.model.User;
import com.nulltech.eLibrary.repository.UserRepository;
import com.nulltech.eLibrary.service.IUserService;

@Service
public class UserServiceImpl implements IUserService 
{
	@Autowired
	private UserRepository userRepository;
	
		public void registerUser(UserDTO userDTO)
		{
			User user = new User();
			user.setFullName(userDTO.getFullName());
			user.setEmailId(userDTO.getEmailId());
			user.setPassword(userDTO.getPassword());
			user.setReferenceId(userDTO.getReferenceId());
			user.setUserType(userDTO.getUserType());
			user.setLastDay(userDTO.getLastDay());
			userRepository.save(user);
		}
}
