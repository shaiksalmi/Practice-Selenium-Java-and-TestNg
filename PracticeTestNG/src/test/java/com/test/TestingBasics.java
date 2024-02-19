package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingBasics {
	
	@BeforeSuite //1
	
	public void setUp() {
		
		System.out.println("setup system property for chrome");
		
	}
	
	@BeforeClass //2
	
	public void launchBrowser() {
		
		System.out.println("Launch Chrome Browser");
		
	}
@BeforeTest //3
	
	public void login()
	{
		System.out.println("Login Method");
		
	}
	
	@BeforeMethod //4
	
	public void enterURL() {
		
		System.out.println("eneter URL");
		
	}
	
	@Test  //5
	
	public void googleTitleTest() {
		
		System.out.println("Goggle title test");
		
	}
	
	
	@AfterMethod //6
	
	public void logOut() {
		
		System.out.println("Logout from app");
		
	}
	
	@AfterTest //8
	public void deleteAllCookies()
	{
		System.out.println("delete all cookies");
	}
	
	@AfterClass //7
	
	public void closeBrowser() {
		
		System.out.println("Close Browser");
	}
	
	@AfterSuite //9
	
	public void generateTestReport() {
		
		System.out.println("Generate Test Reports");
		
	}

}
