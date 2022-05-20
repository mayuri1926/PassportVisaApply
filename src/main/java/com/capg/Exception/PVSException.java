package com.capg.Exception;

public class PVSException 
{
	private String errorMessage;
	private String errorCode;
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
	public PVSException(String errorMessage, String errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}
	public PVSException() {
		super();
	}
	@Override
	public String toString() {
		return "PVSException [errorMessage=" + errorMessage + ", errorCode=" + errorCode + "]";
	}
	
	



}
