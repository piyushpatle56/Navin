package ConstructorDemo;

public class Amitabh {
	
	int ami;
	public Amitabh()
	{ 
		System.out.println("Amitabh Constructor");
	}
	
	public Amitabh(int j)
	{ System.out.println("Amitabh Int argument const");
	}
	
	public void kk(String j)
	{
		System.out.println(" Kk() amitabhs called");
	}
}	
class Abhishek extends Amitabh
{
	boolean abhi;
	Abhishek()
	{
		
		System.out.println(" Abhishek Constructor ");
	}
	
	Abhishek(char ch)
	{ System.out.println(" Abhishek Char arg Constructor ");
	}
	
	public void m1()
	{
		super.kk("ninja");
		System.out.println(" Abhishek()  called");
	}
	
}
class Aish extends Abhishek
{
	String aish;
	Aish()
	{ 
		this("rekha");
		System.out.println("Aish Constructor");
	}
	
	Aish(String kk)
	{ 
		System.out.println("Aish String arg Constructor");
	}
	
	public void m2()
	
	{
		
		super.abhi= false;
		super.ami= 999;
		super.kk("jaya");
		super.m1();
		System.out.println(" Aish()  called");
	}
}

class Runner
{
public static void main(String[] args)
{
	Aish rai= new Aish();
	rai.m2();
	
	
}	
}
