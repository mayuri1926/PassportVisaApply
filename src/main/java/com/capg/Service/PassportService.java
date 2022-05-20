package com.capg.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Model.Passport_Fee;
import com.capg.Repository.PassportRepo;



@Service
public class PassportService {
	@Autowired
	PassportRepo feerepo;
	
	public Passport_Fee addPassport(Passport_Fee passFeeObj)
	{
	   // String no=passFeeObj.getTemporaryNo();
		//String s2=no.substring(4,no.length());
		//int num=Integer.parseInt(s2);


		if(passFeeObj.getTypeOfService().equalsIgnoreCase("Normal"))
		{
			passFeeObj.setAmount(2500);
		}
		else if(passFeeObj.getTypeOfService().equalsIgnoreCase("Tatkal"))
		{
			passFeeObj.setAmount(5000);
		}


		
		return feerepo.save(passFeeObj);
	}

}
