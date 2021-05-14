package com.nulltech.eLibrary.dto;

public class FeedBackDTO 
{
	private long feedbackId;
	
	private String feedbackReview;
	
	private int feedbackScore;
	
	private long bookRoomId;

	public long getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFeedbackReview() {
		return feedbackReview;
	}

	public void setFeedbackReview(String feedbackReview) {
		this.feedbackReview = feedbackReview;
	}

	public int getFeedbackScore() {
		return feedbackScore;
	}

	public void setFeedbackScore(int feedbackScore) {
		this.feedbackScore = feedbackScore;
	}

	public long getBookRoomId() {
		return bookRoomId;
	}

	public void setBookRoomId(long bookRoomId) {
		this.bookRoomId = bookRoomId;
	}
	
	
	

}
