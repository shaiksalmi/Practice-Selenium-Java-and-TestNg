package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

	
	@Test(priority=1)
		public void googleTitleTest()
		{
		String title = driver.getTitle();
	      System.out.println(title);
			
		}
		
	@Test
	public void loginTest()
	{
		System.out.println("Login Test");
		
}
	
	@Test(dependsOnMethods="LoginTest")
	
	public void homePage() {
		
		System.out.println("Home Page Test");
		
	}
	
	@Test(dependsOnMethods="LoginTest")
public void searchPage() {
		
		System.out.println("Search Page Test");
		
	}
	
	@Test(dependsOnMethods="Login Test")
	public void registrationPage()
	{
		
		System.out.println("Registration Page Test");
	}
}
