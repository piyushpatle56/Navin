package FunctionDemo;

public class SortingOfNames {

	public static void main(String[] args) {
	String[] names= {"Gayatri","sonali","Jay","vikas", "vishal", "Minal", "meera", "aadish", "sneha"};
  
  String s1= null;
  String s2= null; 
	for( int i=0;i<names.length;i++)
		{
		for(int j=i+1; j<names.length; j++)
		{ 
			s1= names[i];
			s2= names[j];
			String temp=null;
			for(int m=0, n=0; m<s1.length() && n<s2.length(); m++,n++)
			{
			if(s1.charAt(m)>s2.charAt(n))
			{ temp= names[j];
				names[j]= names[i];
				names[i]=temp;
				break;
			}
				
			else if(s1.charAt(m)<s2.charAt(n))
				break;
	
			else if(s1.charAt(m)==s2.charAt(n))
					continue;
	
			}// for loop for string index
			
		}// inner for loop
		}// outer for loop 

	
	for (int i=0; i<names.length;i++)
		System.out.println(names[i]);
}
	
}