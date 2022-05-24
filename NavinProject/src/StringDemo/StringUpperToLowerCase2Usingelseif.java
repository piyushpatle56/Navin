package StringDemo;

public class StringUpperToLowerCase2Usingelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index;
		String str= "my country is india";
		System.out.println(str.length());
		
	for ( index=0; index<str.length(); index+=1)
	{
		if(index==0)
		{if(str.charAt(index)>=97 && str.charAt(index)<=122)
	System.out.print((char)(str.charAt(index)-32));
		continue;
		}
	
		else if (str.charAt(index)==32)
		{
			System.out.print(str.charAt(index));
	
			index= index+1;
			
			 if (str.charAt(index)>=97 && str.charAt(index)<=122)
			
			System.out.print((char)(str.charAt(index)-32));
			
		}
		
	else
				 System.out.print(str.charAt(index));
	
	
	}// for loop 
	
			
	
		/*char sp= ' ';
		String s= "pu ne";
			int a = s.indexOf(sp);
			System.out.println(a);
			int a1=s.indexOf('n',a);
			
			System.out.println(a1);
	
	char c= s.charAt(s.indexOf(' ')+1);
	System.out.println(" char after space : "+ c);
	*/
	
	}// main

}// class 
