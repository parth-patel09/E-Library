package com.nulltech.eLibrary.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalyzeOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.EntitiesOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.KeywordsOptions;
import com.nulltech.eLibrary.dto.FeedBackDTO;
import com.nulltech.eLibrary.model.BookRoom;
import com.nulltech.eLibrary.model.Feedback;
import com.nulltech.eLibrary.repository.BookRoomRepository;
import com.nulltech.eLibrary.repository.FeedbackRepository;
import com.nulltech.eLibrary.service.IFeedBackService;


@Service
public class FeedbackServiceImpl implements IFeedBackService 
{
	@Autowired
	private BookRoomRepository bookRoomRepo;
	
	@Autowired
	private FeedbackRepository feedbackRepo;
	
	public void NLP(String text)
	{
		NaturalLanguageUnderstanding service = new NaturalLanguageUnderstanding(
		           "2018-03-16",
		           "apikey",
		           "HlIPNIF2vCCeczan4wMSduhgabZakKT2T6xmPcjWLKq-"
		         );
				
		     //The text we want to analyze. You can insert any other text you like.
		/*     String text = "IBM is an American multinational technology " +
		       "company headquartered in Armonk, New York, " +
		       "United States, with operations in over 170 countries.";*/

		     //Entities and keywords are parameters you get back from the service about your text.
		     EntitiesOptions entitiesOptions = new EntitiesOptions.Builder()
		       .emotion(true)
		       .sentiment(true)
		       .limit(2)
		       .build();

		     KeywordsOptions keywordsOptions = new KeywordsOptions.Builder()
		       .emotion(true)
		       .sentiment(true)
		       .limit(2)
		       .build();

		     Features features = new Features.Builder()
		       .entities(entitiesOptions)
		       .keywords(keywordsOptions)
		       .build();

		     AnalyzeOptions parameters = new AnalyzeOptions.Builder()
		       .text(text)
		       .features(features)
		       .build();

		     //Take the parameters and send them to your service for resutls.
		     AnalysisResults response = service
		       .analyze(parameters)
		       .execute();

		     //print the result
		     System.out.println(response);
	}
	
	
	public void saveFeedback(FeedBackDTO dto)
	{
		Feedback feedback = new Feedback();		
		BookRoom room = bookRoomRepo.getOne(dto.getBookRoomId());
		
		feedback.setBookRoom(room);
		feedback.setFeedbackReview(dto.getFeedbackReview());
		feedback.setFeedbackScore(dto.getFeedbackScore());		
		feedbackRepo.save(feedback);
	}	
}
