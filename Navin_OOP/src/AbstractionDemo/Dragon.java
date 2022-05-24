package AbstractionDemo;

  abstract class  Dragon1{
	
  abstract  void m1();
 
  final public void m2()
  {
	System.out.println(" final method ");  
  }
  
  public Dragon1()
  {
	 System.out.println(" abstract constructor  "); 
  }

  
  public Dragon1(int a)
  { System.out.println(" abstract  1 arg constructor  "); 
  }
  
 }

 class Gorilla extends Dragon1{
	
	 Gorilla()
	{   
		
	//	super();
		this(10);
		System.out.println(" Gorilla constructor ");
		
	}
	
	Gorilla(int x )
	{
		//super();
		System.out.println(" Gori-  1 arg constructor ");
		
	}
	 void	m1()
	{
		System.out.println("Yeah... !! I have completed implementation of dragon ");
	}

}

public  class Dragon
{
public static void main(String[] args) {
	Gorilla g= new Gorilla();
	g.m1();
	g.m2();

	
}	
	
	
}