package AbstractionDemo;
 class Jabong {
	int shoes_number;
	String type;
	{
		System.out.println(" How may i help u..-> non - static block of Jabong 1st");
	}
	{
		System.out.println(" How may i help u..-> non - static block of Jabong 2nd");
	}
	{
		System.out.println(" How may i help u..-> non - static block of Jabong 3rd");
	}
	Jabong()
	{
		System.out.println("Jabong Store..--> Constructor ");	
	}
	static{
		System.out.println("Jabong uses cookies..> static block of jabong 1");
	}
	static{
		System.out.println("Jabong uses cookies..> static block of jabong 2");
	}
//	abstract void clothing() ;
//	abstract String perfumes();
	 int shoes(int x)
	 {
		this.shoes_number= x;
		return shoes_number;
	 }	
}

 