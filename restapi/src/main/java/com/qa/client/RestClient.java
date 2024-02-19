package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	//1. GET Method
	
	public void get(String url) throws ClientProtocolException, IOException {
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		HttpGet httpget = new HttpGet(url); //http get request
		
		//httpClient.execute(httpget); //hit the GET URL
		
		CloseableHttpResponse res = httpClient.execute(httpget); //Hit the GET 
		
		
		//StatusCode:
		
		int statusCode  = res.getStatusLine().getStatusCode();
	
   System.out.println("Staus Code---->"+ statusCode);
   
   //JSON String
   
   String responseString = EntityUtils.toString(res.getEntity());
   
   
   JSONObject responseJson = new JSONObject(responseString);
   
   System.out.println("Response JSON from API---->"+ responseJson);
   
   //All Headers:
   
   Header[] headersArray = res.getAllHeaders();
   
   HashMap allHeaders = new HashMap<String, String>();
   
   for(Header header : headersArray) {
	   
	   allHeaders.put(header.getName(), header.getValue());
	   
   }
   
   System.out.println("HeadersArray---->"+allHeaders);
   
}
}