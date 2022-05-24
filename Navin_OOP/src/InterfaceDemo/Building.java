package InterfaceDemo;

public interface Building {
	
	interface Flats
	{
		void m1();
	}
	
}

class Customer implements Building.Flats
{

	public void m1() {
		
		System.out.println(" m1() Implementation Completed");
		
	}
public static void main(String[] args) {
	
	Customer cx= new Customer();
	cx.m1();
	
	
	
	
}//main	
		
}//class