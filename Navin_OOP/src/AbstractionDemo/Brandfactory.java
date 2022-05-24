package AbstractionDemo;

import InterfaceDemo.WildCraft;

public class Brandfactory extends Jabong  implements WildCraft{
	 Brandfactory()
	 {
		 System.out.println(" Welcome to brand Factory ...?>constructor!!");
	 }
	 static {
		 System.out.println(" brand factory parking -- static brandfactory 1");
	 }
	 static {
		 System.out.println(" brand factory parking -- static brandfactory 2");
	 }
	 {
		 System.out.println(" Entry this way -- non static brandfactory 1st ");
	 }
	 {
		 System.out.println(" Entry this way -- non static brandfactory 2nd");
	 }
	 {
		 System.out.println(" Entry this way -- non static brandfactory 3rd");
	 }
	void clothing()
	{
		System.out.println(" Jabong clothing ");
	}	
String perfumes()
	{
		this.type= " Aromatic perfumes";
		return  type;
	}
void Puma()
{
	 System.out.println(" Puma Outlet !!! ");
}
}