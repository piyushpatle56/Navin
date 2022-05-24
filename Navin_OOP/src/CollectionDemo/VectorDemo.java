package CollectionDemo;

import java.io.Serializable;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Object> v= new Vector<>();
		System.out.println(" capacity of vector :"+v.capacity());

		v.add(777);
		v.add(989);
		v.addElement("pinku");
		v.add("mina");
		v.add(1, "rima");
		v.add(v);
		v.remove("rima");
		v.addElement(null);
	//	v.addAll(v);
		System.out.println(" capacity of vector :"+v.capacity());
		System.out.println(v);
		v.remove(1);
		v.removeElement(v);
		System.out.println(v);
		v.removeElementAt(2);
		System.out.println(v);
		System.out.println(" capacity of vector :"+v.capacity());
System.out.println("size : "+v.size());
		//v.removeAll(v);
		//v.removeAllElements();


System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");

Vector<Object> vec= new Vector<>();
v.add(vec);
vec.add(50);
vec.add(false);
		System.out.println(v);
	v.addAll(1,vec);
	System.out.println(v);
System.out.println("+++++++");
		v.removeAll(vec);
		System.out.println(v);
		v.remove(vec);
		
//v.removeAllElements();
v.clear();
System.out.println(v);
	
v.add(777);
v.add(989);
v.addElement("pinku");
v.add("mina");
v.add(1, "rima");
v.add(v);
v.remove("rima");
v.addElement(null);
	v.add(null)	;
System.out.println(v);	
System.out.println("size :"+v.size());
System.out.println("capacity :"+v.capacity());
v.addElement("pinku");
v.add("mina");
v.add(1, "rima");
v.add("varad");
System.out.println("size :"+v.size());
System.out.println("capacity :"+v.capacity());

System.out.println("+++*******+++");
System.out.println(v);
System.out.println(v.get(6));
System.out.println(v.elementAt(2));
System.out.println(v.firstElement());
System.out.println(v.lastElement());
System.out.println("********");
System.out.println( v instanceof  Serializable);
System.out.println(v instanceof Cloneable);
System.out.println(v instanceof RandomAccess);



	}

}
