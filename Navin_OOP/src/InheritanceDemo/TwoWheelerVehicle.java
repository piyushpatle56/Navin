package InheritanceDemo;

public class TwoWheelerVehicle extends Vehicle{

	String brand;
	int persons;

	
	public void isGear()  // stand-alone method of twowheeler
	{
		System.out.println("isGear method called from twowheeler");
	}
	
	public void havedriver()  // over-ridden method of vehicle 
	{
		
		/*
		 * int m= 10, n=20; int res= m*n; System.out.println("Result : "+ res);
		 */		
		System.out.println("havedriver  OVER_RIDDEN  method called from TWO-WHEELER-VEHICLE ");	
	}

	// setters- getters for IV's 
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPersons(int persons) {
		this.persons = persons;
	}
	public int getPersons() {
		return persons;
	}
	
	
	
	
	
	
	
	
}
