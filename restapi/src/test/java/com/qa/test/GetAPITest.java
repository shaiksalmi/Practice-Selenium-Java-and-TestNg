package com.qa.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.client.RestClient;
import com.qa.restapi.TestBase;

public class GetAPITest extends TestBase{
	
	TestBase testBase;
	String url1;
	
	String url2;
	
	String url;
	
	RestClient restClient;
	
	
	@BeforeMethod
	
	public void setUp()
	
	{
	
       testBase = new TestBase();
       
       url1 = prop.getProperty("URL");
       
       url2 = prop.getProperty("serviceURL");
       
       url = url1 + url2;
}
	
	@Test
	
	public void getTest() throws ClientProtocolException, IOException
	{
		
		 restClient = new RestClient();
		
		restClient.get(url);
		
		
		
	}
	
}