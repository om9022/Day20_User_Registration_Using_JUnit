package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

import com.bridgelabz.userregistration.UserRegistrationException.ExceptionType;

public class UserRegistrationService {
	/**
	 * @param method to check first name 
	 */
	public boolean checkFirstName(String firstName) throws UserRegistrationException
	{
		try
		{
			if (firstName.length() == 0)
			{				
				throw new UserRegistrationException(ExceptionType.ENTERED_EMPTY, "First name cannot be empty");      
			}
			boolean isMatched = Pattern.compile("^[A-Z]{1}[a-z]{3,}$").matcher(firstName).matches();
			checkValid(isMatched);
			return isMatched;
		}
		catch (NullPointerException e) 
		{
			throw new UserRegistrationException(ExceptionType.ENTERED_NULL,"First name cannot be empty");
		}

	}

	/**
	 * @param method to check last name 
	 */
	public boolean checkLastName(String lastName) throws UserRegistrationException
	{
		try
		{
			if (lastName.length() == 0)
			{				
				throw new UserRegistrationException(ExceptionType.ENTERED_EMPTY, "last name cannot be empty");    
			}
			boolean isMatched = Pattern.compile("^[A-Z]{1}[a-z]{3,}$").matcher(lastName).matches();
			checkValid(isMatched);
			return isMatched;
		}
		catch (NullPointerException e) 
		{			
			throw new UserRegistrationException(ExceptionType.ENTERED_NULL,"last name cannot be empty");
		}
	}

	/**
	 * @param method to check email address 
	 */
	public boolean checkEmailAddress(String emailAddress) throws UserRegistrationException
	{
		try
		{
			if (emailAddress.length() == 0)
			{				
				throw new UserRegistrationException(ExceptionType.ENTERED_EMPTY, "Email cannot be empty");     
			}
			boolean isMatched = Pattern.compile("^[0-9a-zA-Z]+([.,+,_,-]{1}[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2})?").matcher(emailAddress).matches();
			checkValid(isMatched);
			return isMatched;
		}
		catch (NullPointerException e) 
		{			
			throw new UserRegistrationException(ExceptionType.ENTERED_NULL,"email cannot be empty");
		}
	}

	/**
	 * @param method to check phone number 
	 */
	public boolean checkPhoneNUmber(String phoneNumber) throws UserRegistrationException
	{
		try
		{
			if (phoneNumber.length() == 0)
			{				
				throw new UserRegistrationException(ExceptionType.ENTERED_EMPTY, "Phone Number cannot be empty");     
			}
			boolean isMatched = Pattern.compile("^[0-9]{2}[ ][0-9]{10}$").matcher(phoneNumber).matches();
			checkValid(isMatched);
			return isMatched;
		}
		catch (NullPointerException e) 
		{			
			throw new UserRegistrationException(ExceptionType.ENTERED_NULL,"Phone number cannot be empty");
		}
	}

	/**
	 * @param method to check password 
	 */
	public boolean checkPassword(String password) throws UserRegistrationException
	{
		try
		{
			if (password.length() == 0)
			{				
				throw new UserRegistrationException(ExceptionType.ENTERED_EMPTY, "Password cannot be empty");     
			}
			boolean isMatched = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[#$%^&-+@]).{8,}").matcher(password).matches(); 
			checkValid(isMatched);
			return isMatched;
		}
		catch (NullPointerException e) 
		{			
			throw new UserRegistrationException(ExceptionType.ENTERED_NULL,"Password cannot be empty");
		}
	}

	/*
	 * @param checking result returned by matcher
	 */
	private void checkValid(boolean isMatched) 
	{
		if(isMatched)
		{
			System.out.println("valid");
		}
		else 
		{
			System.out.println("invalid");
		}
	}

}
