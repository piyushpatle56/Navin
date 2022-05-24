package CollectionDemo;
import java.util.*;
public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList ar= new ArrayList();
		
		ar.add("tide");
		ar.add("surf excel");
		ar.add("Rin");
		ar.add("Nirma");
		
		ListIterator it= ar.listIterator();
		
		/*
		 * System.out.println(it.hasNext());//true
		 * System.out.println(it.nextIndex()+" "+ it.next()); // 0 -tide
		 * System.out.println(it.previousIndex()+" "+ it.previous());// 0 -tide
		 * System.out.println(it.nextIndex()+" "+it.next());//0 - tide
		 * System.out.println(it.nextIndex()+" "+it.next());// 1- surfexcel
		 * System.out.println(it.nextIndex()+" "+it.next()); // 2- rin
		 * 
		 * System.out.println(it.previousIndex()+" "+ it.previous()); //2 rin
		 * System.out.println(it.nextIndex()+" "+it.next());
		 * System.out.println(it.nextIndex()+" "+it.next());
		 * System.out.println(it.nextIndex()); System.out.println(it.next());
		 */

		/*
		 * System.out.println(it.nextIndex()+" "+it.next());
		 * System.out.println(it.nextIndex()+" "+it.next());
		 * System.out.println(it.nextIndex()+" "+it.next());
		 * System.out.println(it.nextIndex()+" "+it.next());
		 * System.out.println(it.nextIndex()); System.out.println(it.previousIndex());
		 * System.out.println(it.previousIndex()+ " "+ it.previous());
		 * System.out.println(it.previousIndex()+ " "+ it.previous());
		 * System.out.println(it.previousIndex()+ " "+ it.previous());
		 * System.out.println(it.previousIndex()+ " "+ it.previous());
		 */
		
		System.out.println(it.hasPrevious()); // false
		while(it.hasPrevious())
			System.out.println(it.previousIndex()+" "+it.previous());
		System.out.println("*** NEXT LIST***");
		while(it.hasNext())
		System.out.println(it.nextIndex()+" "+ it.next());
		
		System.out.println("*** PREVIOUS LIST **");
		
		while(it.hasPrevious())
		System.out.println(it.previousIndex()+" "+it.previous());
		
		LinkedList ll= new LinkedList();
		for(int t=1; t<=10;t++)
		{
			ll.add(t);
		}
		System.out.println(ll);
		
		ListIterator it1= ll.listIterator();
		while(it1.hasNext())
			{
			
			Integer i= (Integer)it1.next();
			//it1.add(i*10);
			it1.set(i*10);
			}
		System.out.println(ll);
		
		Vector v = new Vector();
		
		for(int i= 65; i<=90; i++)
			v.addElement((char)i);
		
		System.out.println(v);
		
		ListIterator i5= v.listIterator();
		int cnt=0;
		while(i5.hasNext())
		{
			if(cnt%2==0)
				{
				i5.next();
				i5.remove();
				cnt++;
				i5.next();
				cnt++;
				}
		}
		System.out.println(v);
	}//main

}//class
