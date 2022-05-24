package ForLoop;

public class VerifyArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 1634;
	//	String s= "";
	//	s= s+n;
	//	System.out.println(s.length());
		
		
String s= String.valueOf(n);

System.out.println(s);

System.out.println("********************");
		int m= n;
		int sum= 0;int j;int res=1;
		
		for (int i=1; i<=s.length(); i++)
		{
			
			j= n%10; // j= 1 , n= 371 // j=7 , n= 37
			res=1;
			
			for(int k=1; k<=s.length(); k++)
			{
				res= res*j;   // j= 1 // 
				
			}
			
			n= n/10;               // n= 37 
			sum= sum+res;          // 1 +// 343+// 27
			
		}
		
		
		System.out.println("sum : "+sum);
		if(sum==m)
		{
			System.out.println(m+" is armstrong number ");
		}
		
		else 
			
			System.out.println(m +" is NOT an  armstrong number ");
		
		
			
			
	}

}
