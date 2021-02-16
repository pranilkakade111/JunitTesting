package com.pranil.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	
	@Test
	public void validateFirstNameTrueCase() 
	{
	boolean result= App.CheckFirstName();
	assertEquals(true, result);
	}


@Test
public void validateFirstNameFalseCase() 
	{
	boolean result= App.CheckFirstName();
	assertEquals(false, result);
	}


}
