package ExceptionPackage;

public class Try_Within_try {

	public static void main(String[] args) {
		// try-catch  within TRY block 
		
		String str1= null;
		String str2= "Pune";

		try {
			
			System.out.println(" Outer try block ");
			try {
				System.out.println(" inner try block");

				int[] arr= {1,2,3,4};
				System.out.println(arr[10]);
				}
			catch(Exception e)
			{
				System.out.print("Inside Try Exception raised--> ");
		System.err.println(e.getLocalizedMessage());
			}
			
			System.out.println(str1.concat(str2));

			
		}
		catch(NullPointerException np)
		{
			System.out.println("..NullPointerException raised");
			
		}
		
		
		
		
		
		
		

	}

}
