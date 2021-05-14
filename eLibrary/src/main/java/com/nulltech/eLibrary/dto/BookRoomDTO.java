package com.nulltech.eLibrary.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.nulltech.eLibrary.model.Room;
import com.nulltech.eLibrary.model.User;

public class BookRoomDTO 
{
	
	private long bookRoomId;
	
	private User user;
	
	private Room room;
	
	private int numberOfPersons;
	
	private String additionalRequirements;
	
	private int bookingStatus;
	
	private Date startTime;
	
	private Date endDate;

	public long getBookRoomId() {
		return bookRoomId;
	}

	public void setBookRoomId(long bookRoomId) {
		this.bookRoomId = bookRoomId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getNumberOfPersons() {
		return numberOfPersons;
	}

	public void setNumberOfPersons(int numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}

	public String getAdditionalRequirements() {
		return additionalRequirements;
	}

	public void setAdditionalRequirements(String additionalRequirements) {
		this.additionalRequirements = additionalRequirements;
	}

	public int getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(int bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}	
	
	
}
