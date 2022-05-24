package ExceptionPackage;

public class Try_Within_Catch {

	public static void main(String[] args) {
// try-catch  within Catch block 
		
		try {
			
		System.out.println(10/0);	
			
		}
		catch(ArithmeticException ae) {
			
			System.out.println("Divide by 0 not possible ");

			try {
				
				String s1= null;
				String s2= new String("Success");
				System.out.println(s1.equals(s2));
			}
			catch(Exception e)
			{
				System.out.println("error message : "+e.getLocalizedMessage());
				
			
			}
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
