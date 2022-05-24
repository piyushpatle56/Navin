package EncapsulationDemo;

public class EncapsulationRunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeccanArea da= new DeccanArea();
		
		da.setLocation("GoodLuck Area");
		da.setDistance(150);
		
		CyberSuccessClass cyber= new CyberSuccessClass();
		cyber.trainer= "Ritesh Sir";
		cyber.area= 500.74f;
		
		
		da.setCyberSuccessClass(cyber);
		//System.out.println(cyber.getTrainer());
		
		System.out.println(da.getLocation()+" :: "+ da.getDistance()+" :: "+
		da.getCyberSuccessClass().getTrainer());
		
		System.out.println("Area : "+ da.getCyberSuccessClass().getArea()+" sq.ft");
		
		da.getCyberSuccessClass().trainingInstitute();
		
		da.isMetro();
	}

}
