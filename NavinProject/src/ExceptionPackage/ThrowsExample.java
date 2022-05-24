package ExceptionPackage;

public class ThrowsExample {
	
	public static void validate(int age) 
	{
		if(age<18)
		{
			throw new NullPointerException(" Not eligible for voting..!!");
		}
		else
			System.out.println("Person eligible for voting");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * System.out.println("LKOUIJ"); Thread.sleep(100);
		 * System.out.println("KJ NFFCET");
		 */
System.out.println("Start of program......");
		
		ThrowsExample.validate(11);
			
			// Thread new Exception ("User defined exception");
			
			

	}

}
