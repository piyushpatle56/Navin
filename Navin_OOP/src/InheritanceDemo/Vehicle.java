package InheritanceDemo;

public class Vehicle {
	
	
	int container;
	String way; // on road, in air, on track
	
	public void canfly()  // stand-alone method of vehicle 
	{
	System.out.println(" canfly method  called from vehicle ");	
	}
	
	public void havedriver() // over-ridden method 
	{
		/*
		 * int a= 10, b=20; int c= a+b; System.out.println("sum : "+ c);
		 */
		
		System.out.println(" havedriver OVER_RIDDEN  method called from VEHICLE  ");	
	}

	
	// setter- getter of IV's 
	public void setContainer(int container) {
		this.container = container;
	}
	public int getContainer() {
		return container;
	}

	public void setWay(String way) {
		this.way = way;
	}
	public String getWay() {
		return way;
	}


	
	
	
	
	
	
	
	
	
	

}
