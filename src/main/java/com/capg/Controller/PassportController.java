package com.capg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Model.Passport_Fee;
import com.capg.Service.PassportService;




@RestController
@RequestMapping("/Passport")
public class PassportController {
	
	@Autowired
	PassportService passService;
	
	@PostMapping("/addPassport")
	
	public ResponseEntity <Passport_Fee> addPassort(@Validated @RequestBody Passport_Fee passportfees){
		
		Passport_Fee ps=passService.addPassport(passportfees);
		return new ResponseEntity<Passport_Fee>(ps,HttpStatus.OK);
		
}
}