package BinarySquareDemo;

public class BinarySquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 int row, col;
		 for(row=1; row<=5; row=row+1)
		 { 
			 
		for(col=1; col<=5; col=col+1) 
		 { 
			 if(row%2==1 && col%2==1 || row%2==0 && col%2==0) 
			 
				 System.out.print("1 ");
		  
			 else 
				 
				 System.out.print("0 ");
		 
		 
		}// inner for loop
		 
		 System.out.println();
		  }// outer for loop
		 
		/*
		 * // output 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		 * 
		 * 
		 */
		
		
		
		/*
		 * int i, j, counter= 1;
		 * 
		 * for(i=1; i<=5; i=i+1) { for(j=1; j<=5; j=j+1) {
		 * 
		 * if(counter%2==1) System.out.print("0 "); else
		 * 
		 * System.out.print("1 "); counter= counter+1;
		 * 
		 * 
		 * }// inner for loop
		 * 
		 * System.out.println();
		 * 
		 * }// outer for loop
		 */
		
		
		
		
	}  // main

}// class
