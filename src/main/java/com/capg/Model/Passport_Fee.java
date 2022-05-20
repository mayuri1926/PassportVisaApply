package com.capg.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
//@Table(name="PASSPORT")
public class Passport_Fee {
	
	@Id
	private String passportNo;

	@NotBlank(message="Must not be blank")
	private String temporaryNo;
	private int amount;
	private String typeOfService;
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getTemporaryNo() {
		return temporaryNo;
	}
	public void setTemporaryNo(String temporaryNo) {
		this.temporaryNo = temporaryNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTypeOfService() {
		return typeOfService;
	}
	public void setTypeOfService(String typeOfService) {
		this.typeOfService = typeOfService;
	}
	public Passport_Fee(String passportNo, String temporaryNo, int amount, String typeOfService) {
		super();
		this.passportNo = passportNo;
		this.temporaryNo = temporaryNo;
		this.amount = amount;
		this.typeOfService = typeOfService;
	}
	public Passport_Fee() {
		super();
	}
	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", temporaryNo=" + temporaryNo + ", amount=" + amount
				+ ", typeOfService=" + typeOfService + "]";
	}
	
	
	
	
	
	

}
