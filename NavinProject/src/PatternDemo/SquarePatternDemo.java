package PatternDemo;

public class SquarePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int row, col;
		
		for (row=1; row<=5; row=row+1)
		{
			for (col=1; col<=5; col=col+1)
			{
				
				if (row==2 && (col==2 || col==3 ||col==4))
				{
					System.out.print("  ");
				}
			else if (row==3 && (col==2 || col==3 ||col==4))
				{
					 System.out.print("  ");
				}
					
			else if (row==4 && (col==2 || col==3 ||col==4))
				 {
					 System.out.print("  ");
				 }
					
				
				else
					System.out.print("* ");
	
			}
				
				
			System.out.println();	
				
				
				
		}

	}

}
