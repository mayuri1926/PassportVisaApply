package com.capg.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class PVSBusinessException extends ResponseEntityExceptionHandler{
	@ExceptionHandler(DestinationNotFoundException.class)
	public ResponseEntity<PVSException>destinationNotFoundException(DestinationNotFoundException ex)
	{
		PVSException response =new PVSException();
		response.setErrorCode("PAGE_NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(DateOfApplyNotFoundException.class)
	
	public ResponseEntity<PVSException>dateOfApplyNotFoundException(DateOfApplyNotFoundException ex)
	{
		PVSException response =new PVSException();
		response.setErrorCode("PAGE_NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(OccupationNotFoundException.class)
	public ResponseEntity<PVSException>occupationNotFoundException(OccupationNotFoundException ex)
	{
		PVSException response =new PVSException();
		response.setErrorCode("PAGE_NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(PassportNoNotFoundException.class)
	public ResponseEntity<PVSException> passportNoNotFoundException(PassportNoNotFoundException ex)
	{
		PVSException response =new PVSException();
		response.setErrorCode("PAGE_NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(VisaCostNotFoundException.class)
	public ResponseEntity<PVSException>visaRegistrationNotFoundException(VisaCostNotFoundException ex)
	{
		PVSException response =new PVSException(); 
		response.setErrorCode("PAGE_NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		return new ResponseEntity<PVSException>(response,HttpStatus.NOT_FOUND);
	}
}
