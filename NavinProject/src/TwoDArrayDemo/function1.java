package TwoDArrayDemo;

public class function1 {

	public static void main(String[] args) {
		
   /* int a=20;
    int b=55;
    System.out.println("Addition is:"+(a+b));
	
	}

/*public static int add(int n1,int n2)
{
	int c=n1+n2;
	return c;
	
	
	int a=34;
	int b=89;
	int c=56;
	
	int re=max(a,b,c);
	System.out.println("Maximum no is:"+re);
		
	}


public static int max(int n1,int n2,int n3)
{
	
if((n1>n2)&&(n1>n3))
	return n1;
else if((n2>n1)&&(n2>n3))
	return n2;
else
return n3;

*/
	String name= "Bhagyashri ";
	
//int l=lengthS(name);

System.out.println("The length of string is:"+lengthS(name));
	
}// main

public static int lengthS(String b)
{
int m=0;
for(int i=0;i<b.indexOf(32);i++)
{
	char ch = b.charAt(i);
	if(ch!=' ')
	{ 
	m= m+1;
	continue;
	}
	
}
	return m; 

}// function block

}// class




