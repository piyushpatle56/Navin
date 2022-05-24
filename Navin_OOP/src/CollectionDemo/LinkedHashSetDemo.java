package CollectionDemo;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet l= new LinkedHashSet();
		System.out.println(l.hashCode());
		System.out.println(System.identityHashCode(l));

		l.add("delhi");
		l.add(12.34f);
		l.add(12.34f);
		l.add(null);
		l.add(776);

		l.add("pune");
		l.add(999);
		l.add(null);

		System.out.println(l);
		l.remove(12.34f);
		System.out.println(l);
		
	System.out.println(l.hashCode());
		System.out.println(System.identityHashCode(l));
		LinkedHashSet lhs= new LinkedHashSet();
  lhs.add(500);  lhs.add(1000);
  		
  		LinkedHashSet hs= new LinkedHashSet();
  	  hs.add(500);  hs.add(1000);
  	  		
  	  	System.out.println(lhs.equals(hs));
		
		l.add("str");
		l.remove(776);
		System.out.println(l);
	}

}
