package JavaConcept;

public class PS3 {
	
	int a;
	
	public PS3(int a) {
		this.a = a;
	}

	public int Multiply() {
		
		a=a*3;
		System.out.println("a is incremented");
		System.out.println("b is incremented");
		System.out.println("c is incremented");
		return a;
		
	}
	
	public void Dashboard() {
		System.out.println("Devengers dashboard");
		System.out.println("SF-INDIA dashboard");
		System.out.println("You are on app.scalefusion.com");
	}
	
	public void USGuy() {
		
		System.out.println("you are in calefornia ");
		System.out.println("You are in UK");
	}
}
