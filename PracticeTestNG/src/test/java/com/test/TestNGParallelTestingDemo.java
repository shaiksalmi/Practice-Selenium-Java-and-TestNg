package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParallelTestingDemo {
	
	WebDriver driver;
	
	@Test
	
	public void test1() throws InterruptedException {
		
		System.out.println("I am Inside test1 | "+Thread.currentThread().getId());
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void test2() throws InterruptedException {
		
		System.out.println("I am Inside test2 | "+Thread.currentThread().getId());
		
        driver = new ChromeDriver();
		
		driver.get("https://www.browserstack.com/");
	
		driver.close();

	}
		
	

}
