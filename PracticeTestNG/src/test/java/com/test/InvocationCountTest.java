package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount=10) // If we want to execute same test multiple times.
	public void sum() {
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println("sum is=="+c);
	}

}
