package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotTest {
	
	
	@BeforeMethod
	
	public void setUp()
	{
		
		
	}
	
	@Test
	
	public void takeScreenshotTest()
	{
		Assert.assertEquals(false,true);
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		
		
	}

}
