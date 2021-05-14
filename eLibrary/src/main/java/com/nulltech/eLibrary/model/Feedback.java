package com.nulltech.eLibrary.model;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_ELIBRARY_FEEDBACK_MASTER")
public class Feedback
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long feedbackId;
	
	@ManyToOne
    @JoinColumn(name = "bookRoomId")
	private BookRoom bookRoom;
	
	@Column
	private String feedbackReview;
	
	@Column
	private int feedbackScore;

	public long getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
	}

	public BookRoom getBookRoom() {
		return bookRoom;
	}

	public void setBookRoom(BookRoom bookRoom) {
		this.bookRoom = bookRoom;
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
	
}
