package com.nulltech.eLibrary.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_ELIBRARY_BOOK_ROOM_MASTER")
public class BookRoom 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long bookRoomId;
	
	@ManyToOne
    @JoinColumn(name = "userId")
	private User user;
	
	@ManyToOne
    @JoinColumn(name = "roomId")
	private Room room;
	
	@Column
	private int numberOfPersons;
	
	@Column
	private String additionalRequirements;
	
	@Column
	private int bookingStatus;
	
	@Column
	private Date startTime;
	
	@Column
	private Date endDate;

	public String getAdditionalRequirements() {
		return additionalRequirements;
	}

	public void setAdditionalRequirements(String additionalRequirements) {
		this.additionalRequirements = additionalRequirements;
	}

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
