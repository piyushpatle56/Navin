package StringDemo;

public class VowelsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "InDIA is mY CounTRY";
		String s1= s.toLowerCase();
		System.out.println(s1);
		
		int i;// index
		int a_con=0, e_con=0, i_con=0, o_con=0, u_con=0 ;
		
		for(i=0; i<s.length();i++) 
		{
			 char ch= s1.charAt(i);
			
			if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
			{
			
				switch(ch)
				{
				case 'a': a_con= a_con+1;break;
				case 'e': e_con= e_con+1;break;
				case 'i': i_con= i_con+1;break;
				case 'o': o_con= o_con+1;break;
				case 'u': u_con= u_con+1;break;
				
				}//switch
				
			
			}// if loop 
			
			
		}// for loop
		
		System.out.println("Occurance of a is:" +a_con);
		System.out.println("Occurance of e is:" +e_con);
		System.out.println("Occurance of i is:" +i_con);
		System.out.println("Occurance of o is:" +o_con);
		System.out.println("Occurance of u is:" +u_con);
	int total_vowels= a_con+e_con+i_con+o_con+u_con;
	System.out.println("total vowels in given string : "+total_vowels);
	
	
		
	}// main
}// class
				
		
