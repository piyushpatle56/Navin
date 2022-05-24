package ConstructorDemo;

public class Sample {
	
	int a;
	static char c;
	
	void m1()
	{ System.out.println("m1 non-static  method ");
	}
	
  static void m2()
    { System.out.println("m2 static method ");
    }
	
  
  public  Sample()
  {
	this.a = 100;
	c= '$';
	System.out.println(" default constructor called");
	m1();
	m2();
	
	  
  }
   
  public  Sample(int a, char x)
   {
	this();
 	this.a = a;
 	this.c= x;
	System.out.println("---- 2 arg ( int, char) constructor called");

 	m1();
 	m2();
 	
 	  
   }
    
  public  Sample(char c, int a)
  {
	//this();
	this(120,'%');
	this.a = a;
	this.c= c;	
	System.out.println(" ---- another 2 arg ( char, int ) constructor called");

	m1();
	m2();
	
	  
  }
   
	
  
  
  public static void main(String[] args) {
	
	  Sample ss= new Sample();
	  System.out.println(ss.a);
	  System.out.println(Sample.c);
	  System.out.println("____________");
	  
	  Sample dd= new Sample(10, '#');
	System.out.println(dd.a);
	System.out.println(dd.c);
	  System.out.println("____________");

	  
	Sample gg = new Sample('@',67);
	

}
}
