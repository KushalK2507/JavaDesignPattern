package org.designPattern.builder;

public class TestBuilder {
	
	public static void main(String args [])
	{
		// This is not good practise and not readable
		HttpClient uglyClinet= new HttpClient("GET", "http://google.com", null, null, null, null);
		
		// By this we can see only the methods invoked only fields which are required
		HttpClient httpClinet = new HttpClient.HttpClientBuilder().method("POST").url("http://test.com").body("{ }").build();
	}
}
