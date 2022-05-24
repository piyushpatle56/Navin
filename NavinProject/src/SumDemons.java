import java.util.Scanner;
public class SumDemons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m;
		Scanner sc=new Scanner(System.in);
	System.out.println(" Enter no of elements : ");
		m= sc.nextInt();
		int[] a= new int[m];
		System.out.println(" Enter array elements`` : ");
	for(int i=0; i<m;i++)
	{
		a[i]= sc.nextInt();
	}
		
		int n=0; int result=0;	
		for(int i=0; i<a.length; i++)
		{	n= a[i]+1;
			result=result+(n*a[i]);
		}
	System.out.println("Sum : "+result);
		
	}// main

}// class
