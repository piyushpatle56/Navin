package CollectionDemo;

import java.io.Serializable;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Object> kk = new LinkedList<>();

		kk.add("delhi");
		kk.add(32);
		kk.add('P');
		kk.add(null);
		System.out.println(kk);
		System.out.println("size of linkedlist : " + kk.size());

		kk.set(2, "Pune"); // replace element at index 2
		System.out.println(kk);

		kk.addLast("Mumbai");
		System.out.println(kk);

		kk.addFirst(null);
		System.out.println(kk);

		kk.addFirst(args);
		System.out.println(kk);
		
		kk.remove(); // removes heading element
		System.out.println(kk);

		kk.remove(3);
		System.out.println(kk);
		
		System.out.println(kk.remove(1)); // Returns the removed element value 
System.out.println("-------");
		
	kk.removeFirst(); 
	kk.removeLast(); 
	System.out.println(kk);
		 
	
	  LinkedList bb= new LinkedList(kk); 
	  bb.add("mno"); 
	  bb.add(44); 
	  bb.add(99.976);
	  
	  System.out.println(bb);
	  
	  System.out.println(bb.getFirst());
	  System.out.println(bb.getLast());
	  System.out.println(bb.get(2));
	  System.out.println("-----");
	  System.out.println(bb.getClass());
	  
	  
	  
	  
  Object list= bb.clone(); 
	  System.out.println(list);
	  System.out.println(kk.clone());
	  
		
		//  bb.clear(); System.out.println(bb);
		  
		//  kk.clear(); System.out.println(kk);
		 
		/*  System.out.println(bb.iterator());
		  System.out.println(bb.hashCode());
	  System.out.println(System.identityHashCode(bb));
	*/
	  
	  System.out.println(bb instanceof Serializable);  // true 
	  System.out.println(bb instanceof Cloneable);    // true
	  System.out.println(bb instanceof RandomAccess);  // false
	  
	  System.out.println(bb);
	  bb.addLast("last");
	  System.out.println(bb);
bb.add(null);
System.out.println(bb);
bb.add(true);
System.out.println(bb);
bb.set(2, "middle");
System.out.println(bb);

	  System.out.println(bb.removeLast());
	  System.out.println("****_____________");
	  System.out.println(bb);
	  System.out.println(bb.element());
	  System.out.println(bb.removeFirst());
	  System.out.println(bb.element());
	 

	}

}
