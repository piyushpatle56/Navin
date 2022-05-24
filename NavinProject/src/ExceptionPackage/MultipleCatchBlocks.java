package ExceptionPackage;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String s= "Pune";
			String s2= null;
			System.out.println(10/0);
			System.out.println(s2.equals(s));
			int a[]= {10, 20};
			System.out.println(a[5]);
		}
		catch(NullPointerException np)
		{
			System.err.print(" Null pointer exception  raised/  ");
			System.out.println(np.getMessage());
		}
		catch(ArithmeticException ae)
		{
			System.err.print("ArithmeticException Exception raised / ");
			System.out.println(ae.getMessage());
		}
		/*
		 * catch(ArrayIndexOutOfBoundsException aio) {
		 * System.err.println(" Array Index Out Of Bounds Exception"); }
		 */
		catch(Exception e)
		{
			System.err.print("Exception raised / ");
			System.out.println(e.getMessage());
		}
	}//main

}//class
