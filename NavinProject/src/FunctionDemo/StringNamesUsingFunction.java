package FunctionDemo;

public class StringNamesUsingFunction {

	public static void main(String[] args) {
		// Print name of max length 
		
	String [] names= {"Bhagyashri", "Shital", "Pradnya", "Piyush", "Saksham", "Maharashtra", 
			"magarpatta", "Mahendra Singh Dhoni " };
		

		int m= maxlength(names);
		String[] s= printnames(names);
		
		for(int i=0; i<s.length; i++)
		if(m== s[i].length())
			System.out.println(s[i]+" "+m);
		System.out.println("_______________________________");
		for(int j=0; j<s.length;j++)
		System.out.println(s[j]+" "+s[j].length());
	}// main
	
	
	///******* Functions *****
	
public static int maxlength(String... names)
	{
		int[] l=new int[names.length];
		
		for(int i=0; i<names.length; i++)
		l[i]= names[i].length();
		
		int max=0;
		for(int j=0; j<l.length;j++)
			if(l[j]>=max)
				max= l[j];
			
		return max;
	}//maxlength function ended
	
	public static String[] printnames(String... names)
	{
		String[] n= new String[names.length];
	
		for(int i=0; i<names.length; i++)
		n[i]= names[i];
		return n;
		
	}//printnames  function ended
	
}// class
