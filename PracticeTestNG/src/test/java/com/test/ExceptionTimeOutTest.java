package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	@Test(timeOut=2000)//timeOut and invocationTimeout(milliseconds) 
	//@Test(expectedExceptions=NumberFormatException.class) - Don't fail my test because I expect this exception.
	//Bad way of writing a loop if we have to write we have to provide timeout.
	public void infinteLoopTest() {
		
		int i = 1;
		
		while(i==1)
		{
			System.out.println(i);
		}
		
	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	
	//This is a feature in testNG, just we should now it.
	//If any exceptions or error coming in Selenium we will mark our test case as fail.
	public void test1()
	{
		
		String x = "100A";
		
		Integer.parseInt(x);
	}
}
