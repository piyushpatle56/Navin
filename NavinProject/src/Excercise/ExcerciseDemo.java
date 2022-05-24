package Excercise;


public class ExcerciseDemo
{
	char c= '$';
	static boolean b= true;
	
	void m1()
	{
	System.out.println(c);
	System.out.println(b);
	
	}
	
	static void m2()
	{
		ExcerciseDemo ed= new ExcerciseDemo();
	System.out.println(ed.c);
	System.out.println(b);
	
	}
	
public static void main(String[] args) {
	
	
	ExcerciseDemo d= new ExcerciseDemo();
	d.m1();
	
      m2();

}
	
	
}



