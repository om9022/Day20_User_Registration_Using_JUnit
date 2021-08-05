package com.bridgelabz.userregistration;

public class UserRegistrationException extends Exception {

	public enum ExceptionType
	{
		ENTERED_NULL,ENTERED_EMPTY
	}
	
	public ExceptionType type;

	public UserRegistrationException(ExceptionType type,String message) {
		super(message);
		this.type = type;
	}
}
