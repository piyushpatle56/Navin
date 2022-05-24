package InheritanceDemo;

public class RunnerVehicleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoWheelerVehicle tw= new TwoWheelerVehicle();
		
		tw.havedriver();
		
		Vehicle vt= new TwoWheelerVehicle();
		
	vt.havedriver();
		
		
		
		// two-- all iv, standalone methods
		// vehicle --- all iv, standalone methods
		//==== overriden of child only 
		
		//Vehicle v= new TwoWheelerVehicle();
		
				// vehicle --- all iv, standalone methods
				//==== overriden of child only 
		TwoWheelerOwner my= new TwoWheelerOwner();
		
		my.setOwner_name("Piyush"); // IV set of 2-wheeler-owner
		System.out.println("Owner name : "+my.getOwner_name());
		
	my.setContainer(2);   // IV set of vehicle
	System.out.println("max persons on vehicle : "+my.getContainer());
		
	my.setBrand("Royal Enfeild");  // IV set of 2-wheeler-vehicle 
	System.out.println(" My vehicle brand :"+my.getBrand());
		
		my.canfly(); // standalone () called of vehicle 
		my.isGear(); // standalone () called of two wheeler Vehicle
	
my.havedriver();// over-ridden can only be called of child- i.e.  2-wheeler-OWNER 
 
	
	
		
		
	}

}
