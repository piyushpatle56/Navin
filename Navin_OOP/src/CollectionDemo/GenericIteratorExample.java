package CollectionDemo;

import java.util.ListIterator;
import java.util.Vector;

public class GenericIteratorExample {

	public static void main(String[] args) {

		Vector v= new Vector();
		v.add("pune");
		v.add(100);
		v.add("Cyber");
		v.add("creative");
		v.add(500);
		v.add(true);
		v.add("Success");
		v.add('S');	
		v.add("Deccan");
		v.add(200);
		
		ListIterator i=v.listIterator();
		while(i.hasNext())
		{
			
			  Object o= i.next(); 
			  if(o instanceof String)
				  System.out.println(o);
			 
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
