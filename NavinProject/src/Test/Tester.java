package Test;
public class Tester {
	public static void main(String[] args) {
		int[] a= {10,98,12,3,33,22,21,11};
		System.out.println("original ");
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i] +" ");
		}
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
			int temp=0;
			if(a[i]%2==0)
			continue;
			else
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
			}
		}
		System.out.println("\n Sorted ");
			for(int i=0; i<a.length;i++)
			{
				System.out.print(a[i] +" ");
			}
	}
}
