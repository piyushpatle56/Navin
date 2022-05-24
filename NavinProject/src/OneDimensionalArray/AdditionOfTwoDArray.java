package OneDimensionalArray;

public class AdditionOfTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row, col;
		
		
		int[][] a = new int[][]
			{
				{ 1, 2, 3},
				{ 4, 5, 6}, 
				{ 7, 8, 9}
			
			};
		
			int[][] b = new int[][]
					{
						{ 10, 20, 30},
						{ 40, 50, 60}, 
						{ 70, 80, 90}
					
					};
				int[][] c= new int[a.length][b.length];
		
		for(row=0; row<a.length; row++)
		{
			for(col=0; col<a[row].length; col++)
			{
				
				c[row][col]= a[row][col]+ b[row][col];
				
			}// inner for loop
		}// outer for loop
				
		
		for(row=0; row<a.length; row++)
		{
			
			for(col=0; col<a[row].length; col++)  // print a array elements 
			{
				System.out.print(String.format("%-3d",a[row][col]));   
				
			}
			
			if(row!=1)								// space between array a & b
				System.out.print("\t");
			else
				System.out.print("   +   ");          // for row =1 prints + sign 
			
			
			for(col=0; col<a[row].length; col++)  // print b array elements 
			{
				System.out.print(String.format("%-3d",b[row][col] ));
				
			}
			
			if(row!=1)
				System.out.print("\t");            // space between array b & c
			else
				System.out.print("  =    ");			 // for row =1 prints = sign 
			
			
			for(col=0; col<a[row].length; col++) // print c array elements 
			{
				System.out.print(String.format("%-3d",c[row][col]));
				
			}
			
			System.out.println();
			
			
		}// outer for == row 
		
		
		
		

	}// main

}// class
