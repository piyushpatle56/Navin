package ExceptionPackage;

public class Nested_Try_Catch {

	public static void main(String[] args) {

		try {
			
			System.out.println("Kuch toh log kahenge..");
			System.out.println(10/5);
			try {
				String s= null;
				System.out.println(s.concat("Pune"));
			}
			catch(Exception e )
			{
				System.err.println("can not concat withh null");
			}
			System.out.println("!!!!!!!!!");
			
		}
		catch(Exception e )
		{
		System.err.println("divide by zero not possible");	
		try {
			int[] a= {10, 20, 30};
			System.out.println(a[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException aio)
		{
			System.err.println("Index Out of bound");
		}
		
		}
		finally {
			System.out.println("....");
			System.out.println("Logo ka kam hai kehena..!! ");
			
			try {
				String s1= null;
				String s2=null;
				String s3=s1.concat(s2);
				System.out.println(s3);
			}
			catch(Exception ee)
			{
				System.out.println(" finally-->  try-catch ");
			}
		}
		
		
	}//main

}//class
