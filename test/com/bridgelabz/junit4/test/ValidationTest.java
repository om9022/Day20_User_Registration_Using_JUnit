package com.bridgelabz.junit4.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.blc.programs.UserValidation;


public class ValidationTest {

//	@Test
//	public void test() {
//		assertEquals(2,3);
//	}
	
	@Test
	public void findMaValueFromArray() {
		assertEquals(5, UserValidation.findMaxValuOfArray(new int[] {5,1,2,3,4} ));
	}
}
