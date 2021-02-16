package com.junit.apptest;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
public class AppTest    
{
	@Test
	public void validateFirstName_WhenProper_ShouldReturnTrue() 
		{
	
		boolean result= App.CheckFirstName();
		assertEquals(true,result);

		}

	@Test
	public void validateFirstName_WhenProper_ShouldReturnFalse()
		{
		boolean result= App.CheckFirstName();
		assertEquals(false, result);
		}
	
	
	@Test
	public void validateLastName_WhenProper_ShouldReturnTrue() 
		{
		boolean result= App.CheckLastName();
		assertEquals(true, result);
 
		}
	
	
	@Test
	public void validateLastName_WhenProper_ShouldReturnFalse() {
		boolean result= App.CheckLastName();
		assertEquals(false, result);
		}
	
	
	
	@Test
	public void validatePhoneTrueCase() 
	{
		boolean result= App.checknumber();
		assertEquals(true, result);
 
	}
	
	
	
	@Test
	public void validatePhoneFalseCase() 
		{
		boolean result= App.checknumber();
		assertEquals(false, result);
		}

   @Test
	public void validateEmail_WhenProper_ShouldReturnTrue() 
		{
		boolean result= App.checkemail();
		assertEquals(true, result);
 
		}
	
	
	@Test
	public void validateEmail_WhenProper_ShouldReturnFalse() 
		{
		boolean result= App.checkemail();
		assertEquals(false, result);
		}
	
	public void validatePassword_WhenProper_ShouldReturnTrue() 
	{
	boolean result= App.checkpassword();
	assertEquals(true, result);

	}




public void validatePassword_WhenProper_ShouldReturnFalse() 
	{
	boolean result= App.checkpassword();
	assertEquals(false, result);
	}
	
	}
