package PatternDemo;

public class StarSquareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int row, col, max=5, min=1  ;
		
		for (row=1; row<=max; row=row+1)
		{
			for (col=1; col<=max ; col=col+1)
			{
				
				if (row==1|| col==1 || row==max|| col==max )
					
					System.out.print("* ");
		
				
				else
					System.out.print("  ");
				
			}
				
				
			System.out.println();	
				
				
				
		}

	}

}
