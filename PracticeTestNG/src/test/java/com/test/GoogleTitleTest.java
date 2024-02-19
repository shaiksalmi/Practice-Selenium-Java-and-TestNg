package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
	WebDriver driver;
	@BeforeMethod
	
	public void setUp() {
		
		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
	}
	
	@Test()
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google");
		
		//Assert.assertEquals(title, "Google123", "title is not matched"); // if it fails we can put one message also.
	}
	
	@Test
	
	public void googleLogoTest() {
		
		//boolean b = driver.findElement(By.className("lnXdpd")).isDisplayed();
		
		boolean b = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		Assert.assertTrue(b);
		
		//Assert.assertEquals(b, true);
	}
	
	
	
	
	@AfterMethod
	
	public void tearDown()
	{
		
		driver.quit();
	}

}
