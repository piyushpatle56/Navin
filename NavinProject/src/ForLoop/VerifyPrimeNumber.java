package ForLoop;

import java.util.Scanner;

public class VerifyPrimeNumber {

	public static void main(String[] args) {
		// find prime numbers in given range 
		
		Scanner sc= new Scanner(System.in);
		System.out.println(" please input ");
		int minrange= sc.nextInt();
		int maxrange= sc.nextInt();
		int min, max;
		if(minrange<0 && maxrange<0 || minrange<0 && maxrange>0)
		{
		min = Math.abs(maxrange) ;
		 max= Math.abs(minrange);
		}
		
		else
		{
		min=minrange;
		max=maxrange;
		}
		int sum=0;
		
		
	//	System.out.println("Prime numbers between " +min+" to "+max);
		
		
		for (int no=min; no<=max; no++)
		{
		boolean b= isPrime(no);
		
			if(b)
			{
				sum=sum+no;
			//System.out.print(no+"  ");
			}
		//	else
		//	System.out.println(no+" is NOT a prime number");
			
		
		}
		
		System.out.println(sum);
	}// main
	
	public static boolean isPrime(int number)
	{
	boolean flag= true;
	for(int i=2; i<number/2; i++)
	{
		if(number%i==0)
		{
		flag= false;
			break;
		}		
		
	} // for
	return flag;
		
	}	// function block
	
}// class
