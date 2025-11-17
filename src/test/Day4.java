package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	
	@AfterTest
	
	public void lastExecution() {
		System.out.println("I will execute at last");
	}
	
@Test
	
	public void WebloginHomeLoan() {
		
		System.out.println("You are doing Home loan Web-Login");
		
	}
	
@Parameters({"URL","APIKey/Username"})
	@Test
	public void MobileloginHomeLoan(String urlname , String key) {
		
		System.out.println("You are doing Home loan Mobile-Login");
		System.out.println(urlname);
		System.out.println(key);
	}
	@Test
	
	
	public void APIloginHomeLoan() {
	
	System.out.println("You are doing Home loan API-Login");
	}
	@BeforeSuite
	
	public void BFSuite()
	{
		System.out.println("I am no 1");
	}
	

		//For explaining .* importance
	@Test
	
	public void MobileSignin() {
		System.out.println("Doing Mobile Sign-in");
	}
	
	@Test
	public void MobileSignout() {
		System.out.println("Doing Mobile Sign-out");
	}
	
}
