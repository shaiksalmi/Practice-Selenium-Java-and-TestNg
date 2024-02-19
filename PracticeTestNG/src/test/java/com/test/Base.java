package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static void initialization()
	{
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
	}
	
	
	public void failed() throws IOException
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrFile,new File("F:\\MyWorkSpace\\PracticeTestNG\\src\\test\\java\\com\\test\\screenshots"));
		
	}

}
