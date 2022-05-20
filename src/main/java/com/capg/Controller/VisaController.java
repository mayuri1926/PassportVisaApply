package com.capg.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Model.Visa;
import com.capg.Service.VisaService;

@RestController
@RequestMapping("/Visa")
public class VisaController {
	
	@Autowired
	private VisaService visaservice;
	
	@PostMapping("/addVisaDetails")
	public ResponseEntity<Visa> addVisaDetails(@Validated @RequestBody Visa visaRegObj)
	{
		Visa UserResponse=visaservice.visa(visaRegObj);
		return new ResponseEntity<Visa>(UserResponse ,HttpStatus.OK);
		
	}

	@GetMapping("/fetchVisaDetails/{PassportNo}")
	public ResponseEntity<List<Visa>> fetchByPassportNo(@PathVariable String PassportNo)
	{


		List<Visa> obj = visaservice.findByPassportNo(PassportNo);



		return new ResponseEntity<List<Visa>>(obj, HttpStatus.OK);
	}



	}
	

