package com.bridgelabz.junit4.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.bridgelabz.userregistration.UserRegistrationException;
import com.bridgelabz.userregistration.UserRegistrationException.ExceptionType;
import com.bridgelabz.userregistration.UserRegistrationService;

import com.bridgelabz.userregistration.UserRegistrationService;

public class UserRegistrationTest {
	UserRegistrationService validator = new UserRegistrationService();
	//checking conditions for first name
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() 
	{
		assertTrue(validator.checkFirstName("Abcd"));			
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() 
	{
		assertFalse(validator.checkFirstName("Ab"));			
	}

	@Test
	public void givenFirstName_WhenFirstNotInUpperCase_ShouldReturnFalse() 
	{
		assertFalse(validator.checkFirstName("abcd"));			
	}

	//checking conditions for last name
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() 
	{
		assertTrue(validator.checkLastName("Abcd"));			
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() 
	{
		assertFalse(validator.checkLastName("Ab"));			
	}
	
	@Test
	public void givenLastName_WhenFirstNotInUpperCase_ShouldReturnFalse() 
	{
		assertFalse(validator.checkLastName("abcd"));			
	}
	
	//checking conditions for email
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue()
	{
		assertTrue(validator.checkEmailAddress("abc.xyz@bridgelabz.co.in"));
	}

	@Test
	public void givenEmail_WithoutUserName_ShouldReturnFalse()
	{
		assertFalse(validator.checkEmailAddress("@bridgelabz.co.in"));
	}

	@Test
	public void givenEmail_WithoutDomainName_ShouldReturnFalse()
	{
		assertFalse(validator.checkEmailAddress("abc.xyzco.in"));
	}
	
	@Test
	public void givenEmail_WithoutDomain_ShouldReturnFalse()
	{
		assertFalse(validator.checkEmailAddress("abc.xyz@bridgelabz"));
	}

	@Test
	public void givenEmail_WithoutOptinalUserName_ShouldReturnTrue()
	{
		assertTrue(validator.checkEmailAddress("abc@bridgelabz.co.in"));
	}

	@Test
	public void givenEmail_WithoutOptinalDomain_ShouldReturnTrue()
	{
		assertTrue(validator.checkEmailAddress("abc.xyz@bridgelabz.com"));
	}
	
	//test cases to Check Password
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue()
	{
		assertTrue(validator.checkPassword("Abacd@12"));
	}

	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse()
	{
		assertFalse(validator.checkPassword("Ab@12"));
	}

	@Test
	public void givenPassword_WithoutUpperCase_ShouldReturnFalse()
	{
		assertFalse(validator.checkPassword("abacd@12"));
	}

	@Test
	public void givenPassword_WithoutLowerCase_ShouldReturnFalse()
	{
		assertFalse(validator.checkPassword("ABACD@12"));
	}

	@Test
	public void givenPassword_WithoutNumeric_ShouldReturnFalse()
	{
		assertFalse(validator.checkPassword("Abacd@aa"));
	}

	@Test
	public void givenPassword_WithoutSpecailCharacter_ShouldReturnFalse()
	{
		assertFalse(validator.checkPassword("Abacds12"));
	}

	@Test
	public void givenFirstName_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.checkFirstName(null);
		}
		catch (UserRegistrationException e) 
		{
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void givenFirstName_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.checkFirstName("");
		}
		catch (UserRegistrationException e) 
		{
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void givenLastName_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.checkLastName(null);
		}
		catch (UserRegistrationException e) 
		{
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.checkLastName("");
		}
		catch (UserRegistrationException e) 
		{
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void givenEmail_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.checkEmailAddress(null);
		}
		catch (UserRegistrationException e) 
		{
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenEmail_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.checkEmailAddress("");
		}
		catch (UserRegistrationException e) 
		{
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void givenPhoneNumber_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.checkPhoneNUmber(null);
		}
		catch (UserRegistrationException e) 
		{
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenPhoneNumber_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.checkPhoneNUmber("");
		}
		catch (UserRegistrationException e) 
		{
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void givenPassword_WhenNull_ShouldReturnException()
	{
		try 
		{
			validator.checkPassword(null);
		}
		catch (UserRegistrationException e) 
		{
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenPassword_WhenEmpty_ShouldReturnException()
	{
		try 
		{
			validator.checkPassword("");
		}
		catch (UserRegistrationException e) 
		{
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}
