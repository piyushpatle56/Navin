package Array3DDemo;

public class MultiplicationOf3DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][]  a= new int[][] 
		{
			{10, 20, 30},
			{40, 50, 60},
			{70, 80, 90}
			
		}; 
	
		int[][]  b= new int[][] 
				{
					{ 1, 2, 3}, 
					{ 4, 5, 6},
					{ 7, 8, 9}
					
				};
				
				int res= 0; 
				
				
				for (int row =0; row<a.length; row++)  // row sathi
				{
					
					
					
					
					for(int j=0; j<b[0].length; j++)  // dusra array cha col increment sathi
					{
						
						res= 0; 
					for (int i=0; i<a[0].length; i++)
					{
						
						res=res+  a[row][i]* b[i][j];
						
					}
					System.out.print(String.format("%-5d", res));
					}
					
					System.out.println();
				}// outer for 
				
		

	}// main

}// class
