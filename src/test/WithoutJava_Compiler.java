package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class WithoutJava_Compiler {
	
	@Test (groups={"Smoke"})
	
	public  void Demo ()
	{
		System.out.println("Hello");
	}
	@AfterSuite
	
	public void AfSuite() {
		
		System.out.println("I am last no 1 ");
	}
	@Test(groups={"Smoke"})

	public  void Test2 () {
		
		System.out.println("Bye");
	}
	
	@Test 
		public void Test3() {
		System.out.println("I am the basic one ");
	}
		
	}
