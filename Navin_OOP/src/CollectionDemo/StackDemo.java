package CollectionDemo;
import java.io.Serializable;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s= new Stack();
		System.out.println(s);
	
		System.out.println(s.isEmpty());
		s.push("first");
		for(int i= 1; i<=5; i++)
		s.push(i);
		
		System.out.println(s);
		s.add(1, "second");
		System.out.println(s);
		
	System.out.println(s.get(3));
		s.pop();
		System.out.println(s.pop());
	System.out.println(s.peek());
	s.peek();
	
		System.out.println(s);
		//System.out.println(s.empty());
		
		int i= s.search("first");
System.out.println(i);
//System.out.println(s.push("mni"));
System.out.println(s.get(0));
System.out.println(s.get(1));
System.out.println("_+_+_++++++++_+_++");
System.out.println(s instanceof Serializable);
System.out.println(s instanceof Cloneable);
System.out.println(s instanceof RandomAccess);

	}

}
