package BasicOOP;

public class Bike {
	
	String brand;
	int price;
	float wt;
	boolean b;
	
	static String name;  // static IV
	
	/*
	 *  byte m; short c; long l; double j;
	 */
	
	public Bike()   // constructor 
	{
		this.brand= " Default Brand"; // default IV values
		this.price= 19;
		this.b= true;
	}
	public float getWt() {
		return wt;
	}

public boolean isB() {
		return b;
	}

	public static String getName() {
		return name;
	}

	public void setWt(float wt) {
		this.wt = wt;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public static void setName(String name) {
		Bike.name = name;
	}

	public void modelname()
	{
		System.out.println("My new bike");
	}
	
	public void bikeprice() 
	{
		System.out.println(" Bike price : "+ price);
	}
	
	public void brandname(String brand) 
	{
		System.out.println(" Brand name : "+ brand);
	}

	// getter setter methods for IV 
	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public static void functionName() {
		
		System.out.println("Cyber Success.........");
	}
	
}
