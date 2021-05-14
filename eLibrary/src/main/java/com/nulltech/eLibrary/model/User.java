package com.nulltech.eLibrary.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_ELIBRARY_USER_MASTER")
public class User 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long userId;
	
	@Column
	private String emailId;
	
	@Column
	private String fullName;
	
	@Column
	private int userType;
	
	@Column
	private String referenceId;
	
	@Column
	private String password;
	
	@Column
	private Date lastDay;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastDay() {
		return lastDay;
	}

	public void setLastDay(Date lastDay) {
		this.lastDay = lastDay;
	}
	
	
	
}
