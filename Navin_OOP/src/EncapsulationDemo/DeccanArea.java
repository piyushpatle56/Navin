package EncapsulationDemo;

public class DeccanArea {
	
	String location;
	int distance;
	CyberSuccessClass cb;
	
	public void setLocation(String location) 
	{
		this.location = location;
	}
	public String getLocation() 
	{
		return location;
	}
	
	public void setDistance(int distance) 
	{
		this.distance = distance;
	}
	
	public int getDistance()
	{
		return distance;
	}
	
	public void isMetro()
	{
		System.out.println(" located in Pune Metro ");
	}
	// setter getter for CyberSuccessClass
	
	public void setCyberSuccessClass(CyberSuccessClass csc) 
	{
		this.cb = csc;
	}
	public CyberSuccessClass getCyberSuccessClass() 
	{
		return cb;
	}
	
	
	
	
	
	
	

}
