package BasicOOP;

public class RunnerBike {

	public static void main(String[] args) {
// runner class
		Bike b= new Bike();
		  b.price=87000; 
		  System.out.println("bike price : "+b.price);
		 b.brand= "suzuki";
		 System.out.println(" my bike brand is : "+b.brand);
		  b.wt=90.9f;

			/*
			 * int[] a= { 12,3,5 }; System.out.println(" array length: "+ a.length);
			 * 
			 * String s; s = "cyber"; System.out.println("string length : "+ s.length());
			 */
		Bike.name = "Hayabuza";
		System.out.println("Bike.name : "+Bike.name);
	
		Bike b2= new Bike();
		  b2.price = 67000; 
		  System.out.println(b2.price); 
		  b2.bikeprice();
		  
		  System.out.println("_________________");
		  
		  b2.brand = "Yamaha"; 
		  System.out.println(b2.brand); 
		  b2.modelname();
		  
		  b2.brandname("Honda");
		  System.out.println("\n\n******Getter SEtter******");
		  
		  Bike bb= new Bike();
		  bb.setBrand("Mahindra");
		  System.out.println(" Bike brand: "+ bb.getBrand());
		  
		  bb.setPrice(9900);
		  System.out.println(" pricinggg    : "+bb.getPrice());
		
		  Bike bm= new Bike();
		  System.out.println(bm.getBrand());
		  System.out.println(bm.getPrice());
		  
		  
		  bm.modelname();
		  bm.bikeprice();
		  
		  bm.brandname("maruti");
		  bm.setBrand("pulsar");
		  
		  System.out.println("brand name .....: "+bm.getBrand());
		  bm.brandname("pulsar");
		  
		  bm.setPrice(54000);
		  bm.bikeprice();
		  System.out.println("\n\n\n");
		  Bike w= new Bike();
		  Bike.name= "myname";
		 System.out.println("Static varibale default value : "+Bike.name);  
		 System.out.println("Static varibale default value : "+Bike.name);  
		  
		 
		 Bike w2= new Bike();
		 System.out.println("Now value of static Variable : "+Bike.name);
		  Bike.name= "newnew";
			 System.out.println("Now value of static Variable : "+Bike.name);
			 System.out.println("Now value of static Variable : "+Bike.name);

		  
		  System.out.println("brand name:  "+w.brand);
		  System.out.println("bike price : "+w.price);
		  System.out.println("weight of bike : "+w.wt);
		  System.out.println("*****  : "+w.b);
		 
			
//			  System.out.println("\n\n\n"); System.out.println("byte def value : "+w.m);
//			  System.out.println("short def value :"+w.c);
//			  System.out.println("long def value : "+w.l);
//			  System.out.println("Double  def value : "+w.j);
			 
			
			 w.modelname(); w.bikeprice(); w.brandname(null);
			
		Bike jj= new Bike();
		System.out.println(jj.brand);
		System.out.println(jj.price);
		System.out.println(jj.wt);
		System.out.println(jj.b);
		System.out.println(Bike.name);
		
		Bike.functionName();
		 
		//Bike kk;
		
		Bike.name= "tavera";
		System.out.println(Bike.name);
		 Bike.functionName();
		  
		
	}

}
