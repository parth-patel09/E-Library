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
@Table(name = "T_ELIBRARY_FEEDBACK_TRACK_MASTER")
public class FeedbackTrack 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long feedBackTrackId;
	
	@ManyToOne
	@JoinColumn(name = "roomId")
	private Room room; 

	@Column
	private int averageScore;

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(int averageScore) {
		this.averageScore = averageScore;
	}
	
	public long getFeedBackTrackId() {
		return feedBackTrackId;
	}

	public void setFeedBackTrackId(long feedBackTrackId) {
		this.feedBackTrackId = feedBackTrackId;
	}

}
