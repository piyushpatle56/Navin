package WhileDemo;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to print  reverse string
		String s= "radar";   //r a d x r
		int max = s.length()-1; 
        int i =0;    int res=0;int sum= 0;
	
		
        if(i!=0)
        
        
        
        while(i>max)
		{
			if (s.charAt(i)== s.charAt(max))
			{
				sum= sum+1;  }// if 
			else
			res= res+1;// else
			
			max= max-1;
			i= i+1;
		}
		
		System.out.println(" sum : "+ sum);
		System.out.println("res : "+ res);
		
		if (res==1)
			System.out.println("  Palindrome String ");
		else
			System.out.println(" Not a Palindrome String ");
		
		// r a dd x r
		
	} // main

}// class
