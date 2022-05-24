package TwoDArrayDemo;

public class ArrayMutiplicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		int [] a= new int[] {4,5,3};
		System.out.println("length of array : "+a.length);
		
		
		
		
		
		
		
		int res= 0;
		int[][] b= new int[][]
				
				{ 
				{40,   50, 60},
				{10,   20, 30}, 
				{70,   80, 90}
			
			
				};
				
				
		
		/*
		 * b[0][0]= 10; b[1][0]= 20; b[2][0]= 30; b[3][0]= 40; b[4][0]= 50; b[5][0]= 60;
		 * 
		 */
	
		System.out.println(" length of col of 2 D array : "+ b[0].length);
		System.out.println(" length of ROW  of 2 D array : "+ b.length);

		
		for (int row=0; row<b.length; row++)
		{
			System.out.print("| ");
			for (int col=0; col<b[0].length; col++)
			{
				
				System.out.print(b[row][col]+"  ");
			}
			
			System.out.println("|");
		}
		
		
		
		
	// System.exit(0);
		
		System.out.println("\n Multiplication result of 1D and 3D array : ");
		
		
		
			for (int j=0; j<b[0].length; j++) // col  2
			{
				res= 0;
				for (int i=0; i<b.length; i++) // row 
				
				{
					
					res= res+ a[i]*b[i][j]; // 1* 4= 4 +// 2* 5=10+// 3*6
					
					
					
					
				}
			
				System.out.println(res);
			//System.out.println("result of 1D and 2D array : "+res);
			
			
		}
		
		

	}// main

}// class
