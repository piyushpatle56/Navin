package ExceptionPackage;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
// Exception handling using try catch block
		
		String a= "DECCAN";
		String b1= "cyber";
		String b2= "success";
		
	try {
		String c= String.join("-", a, b1, b2);
		System.out.println(" result :"+c);
		
		try
		{
			char i= c.charAt(67);
			System.out.println(" character at location: "+ i);
		}
		catch(Exception j) 
		{
		
		System.out.println("error message: "+ j.getMessage());
		}
		
	}
	catch(Exception mno)
		{
		mno.getMessage();
		
		System.out.println("Something wrong:  "+ mno.getMessage());
			
		}finally
		{
		System.out.println(" End of program...");	
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
