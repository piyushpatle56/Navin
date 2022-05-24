package CollectionDemo;

import java.util.*;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector vc= new Vector ();

		vc.addElement(900);
		vc.addElement("lata");
		vc.addElement("nita");
		for(int i=65 ; i<=90;i++)
		vc.addElement((char)i);
	
		//System.out.println(vc);
		System.out.println("^^^^^^^^^^");
	
		/*
		 * Enumeration e= vc.elements(); // e.nextElement();e.nextElement();
		 * e.nextElement(); while(e.hasMoreElements()) {
		 * System.out.print(e.nextElement() +"  "); }
		 * 
		 */ 
		 
		
	//	for (Enumeration e= vc.elements(); e.hasMoreElements();)
		//	System.out.println(e.nextElement()+"  ");
		
//	for(Object number :vc)
	//	System.out.print(String.format("%-6s", number));
		
		// adding a to g in stack 
		
		  Stack s = new Stack(); 
		  for(int i= 97; i<=103;i++) 
			  s.push((char)i);
		  //System.out.println(s);
	
		  Enumeration<Object> e1= s.elements();
		  System.out.println(e1.nextElement());
		  System.out.println(e1.nextElement());
		  System.out.println(e1.nextElement());
System.out.println(e1.hasMoreElements());
System.out.println(e1.nextElement());
System.out.println(e1.nextElement());
System.out.println(e1.hasMoreElements());

System.out.println(e1.nextElement());
e1.hasMoreElements();
System.out.println(e1.nextElement());


System.out.println(e1.hasMoreElements());
System.out.println(e1.hasMoreElements());


		  
	/*	while(e1.hasMoreElements())
			System.out.println(e1.nextElement());
		
	/*	LinkedList pk= new LinkedList();
		for(int j=10; j<=50; j=j+10)
		pk.add(j);
		
		//System.out.println(pk);
//Enumeration ee= pk.element();// Can be used with Legacy Classes only (vector, stack)
	*/	
	}

}
