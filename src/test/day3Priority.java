package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3Priority {
	
	@BeforeClass
	
	public void Befclass() {
		
		System.out.println("You will be execute before class");
	}
	@Test
	
	public void WeblogincarLoan() {
		
		System.out.println("You are doing CarLoan Web-Login");
		
	}
	@Test(dataProvider ="getData")
	
	public void MobilelogincarLoan(String username , String password) {
		
		System.out.println("You are doing CarLoan Mobile-Login");
		System.out.println(username);
		System.out.println(password);
	}
	@BeforeMethod
	
	public void BeforeeveryMethod() {
		
		System.out.println("I will execute before every method in day 3 class");
	}
		
	
	@Test

	public void APIlogincarLoan() {
	
	System.out.println("You are doing CarLoan API-Login");
	
}


}
