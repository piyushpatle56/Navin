package CollectionDemo;

import java.io.Serializable;
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet t= new TreeSet();
	//	t.add(null);
		t.add("Mita");
		t.add("Nobita");
	//	t.add(55.99f); // throws exception-- "java.lang.ClassCastException" 
		t.add("Nita");
		
		t.add("papita");
		t.add("Shamita");
		t.add("Amita");
	//	t.add(15); // throws exception-- "java.lang.ClassCastException" 
		// only homogeneous objects allowed 
		
	//	System.out.println(t);
		
		TreeSet<Integer> ts= new TreeSet<>();
		
//ts.add(null); // gives null pointer Exception error
		ts.add(500);
		ts.add(900);
		//ts.add(null); // gives null pointer Exception error
		ts.add(10);
	
		ts.add(432);
		System.out.println(ts);
		System.out.println(ts instanceof Comparable);

		TreeSet t2 = new TreeSet();
		t2.add(new StringBuffer("Shamika"));
		t2.add(new StringBuffer("Vamika"));
		t2.add(new StringBuffer("Anamika"));
		t2.add(new StringBuffer("Kamolika"));
		//t2.add("Kanika"); // java.lang.ClassCastException
		System.out.println(t2 instanceof Comparable);
		
		
		System.out.println(t2);
	
		int k= "A".compareTo("Z");
		System.out.println(k);
		
		
		
		
		
		
	}

}
