package com.nulltech.eLibrary.dto;

import java.util.Date;

public class UserDTO 
{
	
	private String emailId;
	
	private String password;
	
	private String fullName;
	
	private int userType;
	
	private String referenceId;
	
	private Date lastDay;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Date getLastDay() {
		return lastDay;
	}

	public void setLastDay(Date lastDay) {
		this.lastDay = lastDay;
	}
}
