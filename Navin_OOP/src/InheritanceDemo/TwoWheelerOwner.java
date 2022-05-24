package InheritanceDemo;

public class TwoWheelerOwner extends TwoWheelerVehicle{

	String Owner_name;
	long license;
	int vehicle_number;
	
	
	public void hasTwoWheeler()
	{
		System.out.println(" The Owner has two wheeler with license");
	}

	public void havedriver() // over-ridden method 
	{
		
	System.out.println(" havedriver OVER_RIDDEN () called from 2-wheeler-OWNER ");	
	}
	
	// getter- setter methods for IV's 
	
	public void setOwner_name(String owner_name) {
		Owner_name = owner_name;
	}

	public String getOwner_name() {
		return Owner_name;
	}

	public void setVehicle_number(int vehicle_number) {
		this.vehicle_number = vehicle_number;
	}
	
	public int getVehicle_number() {
		return vehicle_number;
	}

	public void setLicense(long license) {
		this.license = license;
	}

	public long getLicense() {
		return license;
	}
	
	
	
	
	
	

}
