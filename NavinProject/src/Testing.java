import java.util.Scanner;

public class Testing { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		
		String s= sc.next();
		char ch=sc.next().charAt(0);
		
		int cnt=0;
		for (int i=0; i<s.length();i++)
		{
			int ch1= s.charAt(i);
			if(ch==ch1)
				cnt= cnt+1;
			
			
		}
		
		System.out.println(cnt);

	}

}
