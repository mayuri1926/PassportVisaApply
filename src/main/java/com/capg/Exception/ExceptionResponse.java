package com.capg.Exception;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ExceptionResponse extends RuntimeException {

	private String errorMessage;
	private String errorCode;
	private String TEMPORARY_NO;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="DD-MM_YYYY  hh:mm:ss")
	private LocalDateTime timestamp;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getTEMPORARY_NO() {
		return TEMPORARY_NO;
	}
	public void setTEMPORARY_NO(String tEMPORARY_NO) {
		TEMPORARY_NO = tEMPORARY_NO;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
