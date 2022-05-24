package ExceptionPackage;

public class SimpleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try {
		
		System.out.println("Start");
		System.out.println(2/0);
		}
		catch(Exception e)
			{
		System.out.println("Exception catched !!!");
		//System.out.println(10/0);
			}
	finally
	{
		System.out.println("Finally ......");
	}
		
		

	}//main

}//class
