package JavaConcept;

import org.testng.annotations.Test;

public class PS1 extends PS {
	
	@Test
	
	public void testRun() {
		doThis(); // Parent class method
		PS2 ps2 = new PS2(3); //Parametarized Constructor
		//int a= 3;
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		
		//PS3 ps3 = new PS3(3);
		System.out.println(ps2.Multiply());
	}
	

}
