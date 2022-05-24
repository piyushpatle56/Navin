package AbstractionDemo;

public interface Spider {
	
	//void v1();
	static void v2()
	{
		System.out.println("static V2 () of interface");
	}
	 default void v3() 
	 { System.out.println("default V3 () of interface"); }
	 

}

class Webspider implements Spider{
	public void v1()
	{
		System.out.println(" v1() of interface completed");
	}
	
	static  void v2()
	{
		System.out.println("static V2 () of WEBSPIDER");
	}
	
	public void v3()
	{
		System.out.println(" V3 () of Webspider");
	
	}
}
