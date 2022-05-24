package InterfaceDemo;



public interface WildCraft {

	//public  void wildCraftBags();
	
	 static void watches()
	 {
		 System.out.println(" wildcraft Watches..!!"); 
	 }
	 
	 default void floaters()
	 {
		 System.out.println(" wildcraft floaters ..");
	 }
}

class pantaloons implements WildCraft{
	 
	public  void wildCraftBags() {
		System.out.println(" Wildcraft bags ...");
		 
	 }
	
	
	public static void main(String[] args) {
		
		WildCraft p= new pantaloons();	
	//	p.wildCraftBags();
		p.floaters();
		WildCraft.watches();
		
	}
	
	
	
 }

