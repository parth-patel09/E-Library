package com.nulltech.eLibrary.service;

import com.nulltech.eLibrary.dto.FeedBackDTO;

public interface IFeedBackService 
{
	public void NLP(String text);
	
	public void saveFeedback(FeedBackDTO feedback);
}
