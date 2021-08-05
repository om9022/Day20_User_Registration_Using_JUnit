package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) 
	{
		UserRegistrationService details = new UserRegistrationService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to User Registration");

		//asking first name
		System.out.println("Enter First name");
		String firstName =scanner.next();
		details.checkFirstName(firstName);

		//asking last name 
		System.out.println("Enter Last name");
		String lastName =scanner.next();
		details.checkLastName(lastName);

		//asking Email address 
		System.out.println("Enter Email address");
		String emailAddress = scanner.next();
		details.checkEmailAddress(emailAddress);	

		//asking Phone Number 
		System.out.println("Enter Phone number along with country code");
		String phoneNumber =scanner.next();
		phoneNumber += scanner.nextLine();
		details.checkPhoneNUmber(phoneNumber);	

		//asking Password
		System.out.println("Enter Password");
		String password = scanner.next();
		details.checkPassword(password);
		scanner.close();

	}
}
