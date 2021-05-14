package com.nulltech.eLibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nulltech.eLibrary.dto.FeedBackDTO;
import com.nulltech.eLibrary.service.IFeedBackService;

@RestController
public class FeedBackController 
{
	@Autowired
	private IFeedBackService feedbackService;
	
	@GetMapping("/feedback")
	public ModelAndView Home(@RequestBody FeedBackDTO feedBackDTO)
	{
		ModelAndView model = new ModelAndView();
		feedbackService.saveFeedback(feedBackDTO);
		return model;
	}
}
