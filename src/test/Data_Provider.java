package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	
	@Test(dataProvider="getData")
	
	public void getValue(String username, String password) 
	{
		System.out.println(username);
		System.out.println(password);
		
		
	}
	
	@DataProvider
	
	public Object[][] getData() {
		
		//1st combination of username , passowrd with good credit histroy -row
		//2nd combination of username and password with nocredit history
		//fraudlent credit history 
		
		Object[][] data = new Object [3][2];
		
		//1st data set 
		data[0][0] = "firstsetusername";
		data[0][1] ="firstpassword";
		
		//2nd data set
		data[1][0] = "secondsetusername";
		data[1][1]= "secondpassword";
		
		//3rd set 
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;
		
	}

}
