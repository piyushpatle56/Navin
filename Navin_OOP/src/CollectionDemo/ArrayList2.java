package CollectionDemo;

import java.util.*;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a= new ArrayList();
	
		a.add(50);
		a.add("anjali");
		a.add("pinku");
//System.out.println(a.contains("anjali"));
System.out.println(a);


	//	a.add(false);
	//	a.add(45.987f);
	//	a.add("pinku");

System.out.println("lastIndexOf Pinku : "+a.lastIndexOf("pinku"));
System.out.println("Index of Pinku: "+a.indexOf("pinku"));
System.out.println("array-list size : "+a.size());

//System.out.println(a.get(4));
System.out.println(a);
a.set(2, "nilu");
System.out.println(a);
a.add(2,"pinku");
System.out.println(a);

ArrayList<Object> b= new ArrayList<>();
System.out.println(b.size());
b.add(22);
b.add("ram");
b.add(99.88f);
System.out.println(b);
//b.addAll(a);
//b.addAll(1, a);
b.add(2,a);
System.out.println(b);

b.remove(99.88f);
System.out.println(b);
 System.out.println(a.listIterator());

 
 System.out.println(b.contains(a));
 
 
 System.out.println("*******\n"+b);
 List kk= Collections.synchronizedList(b);
 System.out.println(kk);
 System.out.println("-----");
 System.out.println(b.getClass());
 System.out.println(b);

 
 
	}

}
