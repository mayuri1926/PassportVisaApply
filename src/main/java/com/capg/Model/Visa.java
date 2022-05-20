package com.capg.Model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity

public class Visa {
	
	@Id
	private String visaNo;
	
	@NotNull(message="errorCode 621")
	@NotEmpty(message="errorCode 621")
	
	@NotBlank(message="Passport no must not be blank")
	private String passportNo;
	
//	private String userId;
	//@NotBlank(message="Destination must not be blank")
	private String destination;
	//@NotBlank(message="occupation must not be blank")
	private String occupation;
	
	@DateTimeFormat(pattern="DD-MM-YYYY")
	//@NotBlank(message=" Date of apply must not be blank")
	private Date dateOfApply;
	@DateTimeFormat(pattern="DD-MM-YYYY")
	//@NotBlank(message=" Date of issue must not be blank")
	private Date dateOfIssue;
	@DateTimeFormat(pattern="DD-MM-YYYY")
	
	private Date dateOfExpiry;
	
	private int registrationCost;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "userId")
	@JsonBackReference
	private Users users;
	
	public String getVisaNo() {
		return visaNo;
	}
	public void setVisaNo(String visaNo) {
		this.visaNo = visaNo;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
//	public String getUserId() {
//		return userId;
//	}
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Date getDateOfApply() {
		return dateOfApply;
	}
	public void setDateOfApply(Date dateOfApply) {
		this.dateOfApply = dateOfApply;
	}
	public Date getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public int getRegistrationCost() {
		return registrationCost;
	}
	public void setRegistrationCost(int registrationCost) {
		this.registrationCost = registrationCost;
	}
	public Visa(String visaNo,
			@NotNull(message = "errorCode 621") @NotEmpty(message = "errorCode 621") String passportNo, /*String userId,*/
			String destination, String occupation, Date dateOfApply, Date dateOfIssue, Date dateOfExpiry,
			int registrationCost, Users users) {
		super();
		this.visaNo = visaNo;
		this.passportNo = passportNo;
//		this.userId = userId;
		this.destination = destination;
		this.occupation = occupation;
		this.dateOfApply = dateOfApply;
		this.dateOfIssue = dateOfIssue;
		this.dateOfExpiry = dateOfExpiry;
		this.registrationCost = registrationCost;
		this.users = users;
	}
	public Visa() {
		super();
	}
	@Override
	public String toString() {
		return "Visa [visaNo=" + visaNo + ", passportNo=" + passportNo /*+ ", userId=" + userId */+ ", destination="
				+ destination + ", occupation=" + occupation + ", dateOfApply=" + dateOfApply + ", dateOfIssue="
				+ dateOfIssue + ", dateOfExpiry=" + dateOfExpiry + ", registrationCost=" + registrationCost + ", users="
				+ users + "]";
	}
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	

}
