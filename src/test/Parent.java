package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parent {
	
	@BeforeMethod
	
	public void bfMethod() {
		
		System.out.println("run me first");
	}
	@AfterMethod
	
	public void afMethod() {
		
		System.out.println("run me last");
	}

		public void P1() {
			
			System.out.println("This is parent class method");
		}
	}


