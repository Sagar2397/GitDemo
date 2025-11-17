package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XML_Importance {
	
	@AfterMethod
	
	public void AftereveryMethod() {
		
		System.out.println("I will execute After every method in day XML class");
	}
		
	
	@Test(groups={"Smoke"})
	
	public  void Ploan ()	
	{
		System.out.println("Good");
	}

	
	@BeforeTest(groups={"Smoke"})
	
	public void firstExecution() {
		System.out.println("I will execute first ");
		
	}
}
