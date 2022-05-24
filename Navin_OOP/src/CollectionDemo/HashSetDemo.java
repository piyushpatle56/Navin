package CollectionDemo;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
	
		
		// hashSet ---> null insertion allowed once, 
		//duplicates are not allowed --> add() returns false for duplicated object
		// insertion order not preserved
		
		HashSet h= new HashSet();
		
	System.out.println(h.size());
		h.add(100);
		h.add(200);
		h.add(300);
	//	h.add(null);
		for(int i= 65; i<=70;i++)
			h.add((char)i);
		
		h.add(200);
		h.add(300);
	//	h.add(null);
		h.add(null);

		//for(float i=65.99f; i<=70;i++)
		//h.add(i);
	
		h.add(200);
		h.add(300);	
		System.out.println(h);
		System.out.println(h.size());
System.out.println(h.add(null));
		System.out.println(h);
		
		HashSet h1= new HashSet();
h1.add(15);h1.add(25.76f); 
//h1.add(null);
		h.add(h1);
		//System.out.println(h);
		h.addAll(h1);
		System.out.println(h);
		System.out.println(h.containsAll(h1));
		
		
		System.out.println(h.remove(h1));
		System.out.println(h);
		System.out.println(h.removeAll(h1));
		System.out.println(h);
		
h1.clear();
System.out.println(h1);
System.out.println(h.getClass());
System.out.println(h.hashCode());
System.out.println(h1.hashCode());


		
	} // main

}  // class
