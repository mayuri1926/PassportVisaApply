package com.capg.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Model.Visa;
import com.capg.Repository.VisaRepo;



@Service
public class VisaService {

	@Autowired
	VisaRepo visarepo;

	public Visa visa(Visa visaRegObj) {
		String ui = "VISA-1234";
		
		  String s1 = ui.substring(5, 9); 
		  String nu = String.valueOf(s1); 
		  int num =Integer.parseInt(nu);
		 
		int maxnum = num + 1;
		if (!visaRegObj.getPassportNo().isEmpty()) {
			if (visaRegObj.getOccupation().equalsIgnoreCase("STUDENT")) {
				String visaNo = "STU-" + maxnum;
				visaRegObj.setVisaNo(visaNo);
			}

			if (visaRegObj.getOccupation().equalsIgnoreCase("Self Employed")) {
				String visaNo = "SE-" + maxnum;
				visaRegObj.setVisaNo(visaNo);
			}
			if (visaRegObj.getOccupation().equalsIgnoreCase("Government Employee")) {
				String visaNo = "GE-" + maxnum;
				visaRegObj.setVisaNo(visaNo);
			}
			if (visaRegObj.getOccupation().equalsIgnoreCase("Private Employee")) {
				String visaNo = "PE-" + maxnum;
				visaRegObj.setVisaNo(visaNo);
			}
			if (visaRegObj.getOccupation().equalsIgnoreCase("Retired Employee")) {
				String visaNo = "RE-" + maxnum;
				visaRegObj.setVisaNo(visaNo);
			}
		}
		return visarepo.save(visaRegObj);
	}
	
	  public Transaction getApplyCost (Visa visa) throws Exception {
	  
	 Calendar c=Calendar.getInstance(); c.add(Calendar.DATE,10); Date
	  dateOfIssue=c.getTime(); Date dateOfExpiry = null;
	  
	  
	  if(visa.getOccupation().equalsIgnoreCase("Student")) {
	  
	  c.add(Calendar.YEAR,2); dateOfExpiry=c.getTime(); }
	  
	  else if(visa.getOccupation().equalsIgnoreCase("Private Employee")) {
	  c.add(Calendar.YEAR,3); dateOfExpiry=c.getTime(); } else
	  if(visa.getOccupation().equalsIgnoreCase("Government Employee")) {
	  c.add(Calendar.YEAR,4); dateOfExpiry=c.getTime(); } else
	  if(visa.getOccupation().equalsIgnoreCase("Self Employed")) {
	  c.add(Calendar.YEAR,1); dateOfExpiry=c.getTime();
	  
	  } else if(visa.getOccupation().equalsIgnoreCase("Retired")) {
	  c.add(Calendar.YEAR,1); dateOfExpiry=c.getTime();
	  
	  }
	  
	  else { c.add(Calendar.MONTH,6); dateOfExpiry=c.getTime(); }
	  
	 
	  
	  
	  visa.setDateOfIssue(dateOfIssue); visa.setDateOfExpiry(dateOfExpiry); return
	  null; }
	 
	
	public List<Visa> findByPassportNo(String PassportNo) 
	{
		return visarepo.findByPassportNo(PassportNo); 
	}
	  
	
	  
	 
}
