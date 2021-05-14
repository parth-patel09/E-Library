package com.nulltech.eLibrary.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nulltech.eLibrary.dto.UserDTO;
import com.nulltech.eLibrary.model.User;
import com.nulltech.eLibrary.repository.UserRepository;
import com.nulltech.eLibrary.service.IUserService;
import com.nulltech.eLibrary.service.Impl.UserServiceImpl;

@Controller
public class RegistrationController 
{
	@Autowired
	private IUserService userService;
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private UserRepository userRepository;
	
	
	@GetMapping("/registration")
	public ModelAndView Home(@RequestBody UserDTO user)
	{
		ModelAndView modelAndView = new ModelAndView();
		UserDTO userDTO = new UserDTO();
		userDTO.setEmailId("chanpuraraj@gmail.com");
		userDTO.setFullName("Raj Chanpura");
		userDTO.setLastDay(new Date());
		userDTO.setPassword("zxcvbnma");
		userDTO.setReferenceId("1233456");
		userDTO.setUserType(4);
		userServiceImpl.registerUser(userDTO);
		modelAndView.setViewName("BookRoom page");
		return modelAndView;
	}
	
	@GetMapping("/login")
	public ModelAndView login(@RequestBody UserDTO user)
	{
		ModelAndView modelAndView = new ModelAndView();
		Optional<User> user1 = userRepository.findByEmailId(user.getEmailId());
		if(user1.isPresent())
		{
			User use = user1.get();
			if(use.getPassword().equals(user.getPassword()))
			{
				modelAndView.setViewName("BookRoom");
			}
			else
			{
				modelAndView.setViewName("Wrong password");
			}
		}
		else
		{
			modelAndView.setViewName("Error page");
		}
		return modelAndView;
	}

}
