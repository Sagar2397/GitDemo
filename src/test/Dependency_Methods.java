package test;

import org.testng.annotations.Test;

public class Dependency_Methods {
	
	@Test(timeOut=40000)

	public  void zb ()	
	{
	System.out.println("Abhi");
	}
	
	@Test(enabled=false) //we can use @Test(enabled=false) to skip the test case and true to allo the test case 
	public  void loan ()	
	{
		System.out.println("Sagar");
	}

	@Test

	public  void Ra ()	
	{
	System.out.println("Rash");
	}
	

	@Test(dependsOnMethods= {"Ra"})  // We can add comma seperated methods name 

	public  void Cg ()	
	{
	System.out.println("Cat");
	}

}
