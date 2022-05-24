package CollectionDemo;

import java.util.*;

public class IteratorDemo {

	// Iterator on ArrayList 
	public static void main(String[] args) {
		System.out.println(" **** ArrayList ******");
		ArrayList<Object> jj= new ArrayList<>();
		ArrayList<Object> pp= new ArrayList<>();
		ArrayList<Object> ss= new ArrayList<>();
		
		for(int j=65; j<=90;j=j+1)
		jj.add((char)j);
		
//System.out.println(jj);

		Iterator i= jj.iterator(); 
		 int cnt=0;
		while(i.hasNext())
		{
			if(cnt%2==0)
			{ pp.add(i.next());
			 	cnt++;
			}
			else
				{
				ss.add(i.next());
				cnt++;
				}
			
		}
		System.out.println(pp);  System.out.println(ss);
		// Iterator on Linkedlist

		System.out.println(" Linked list *********");
			LinkedList<Integer> ll= new LinkedList();
			for (int j=11; j<=99;j+=11)
				ll.add(j);
			System.out.println(ll);
			
			Iterator<Integer> it= ll.iterator();
			while(it.hasNext())
				{
				int k= it.next();
				if(k%2==0)
				System.out.println(k);
				else 
					it.remove();
				}
			System.out.println(ll);
		
			// Iterator on Vector

System.out.println(" *****VECTOR********");
	
Vector v2= new Vector();
int g=5;
while(g<=50)
{
	v2.addElement(g);
	g+=5;
}
System.out.println("v2 vector list : "+ v2);

Iterator i10= v2.iterator(); 

/*
 * System.out.println(i10.next()); System.out.println(i10.next());
 * System.out.println(i10.next()); System.out.println(i10.next()); i10.remove();
 * System.out.println(v2); System.out.println(i10.next());
 * System.out.println(i10.next()); i10.remove(); System.out.println(v2);
 * 
 * 
 * System.out.println(i10.next()); System.out.println(i10.next());
 * System.out.println(i10.next()); System.out.println(i10.next()); i10.remove();
 * System.out.println(v2); // i10.remove();
 */


int count =0;
  while(i10.hasNext()) {
  
	  if(count %2==0)
	  {
		  System.out.println(i10.next());
		  count++;
	  }
		
		 else
		 { 
			i10.next();
		 i10.remove(); 
		 count++; }
}
  System.out.println(v2);
//Iterator on Stack

  System.out.println("__**  STACK ***___");
  
  Stack sk= new Stack();
  for(int b= 97; b<=105;b++)
  sk.push((char)b);
  
  System.out.println(sk);
  
   Iterator i3= sk.iterator();
 while(i3.hasNext())
{
	System.out.println(i3.next()); 
	if(i3.hasNext())
		i3.next();
 }
 
 System.out.println(sk);
 System.out.println(sk.pop());
 System.out.println(sk.pop());
 System.out.println(sk.pop());
 System.out.println(sk.pop());
 System.out.println(sk.pop());
 System.out.println(sk.pop());
 System.out.println(sk.pop());
 System.out.println(sk.pop());
 System.out.println(sk.pop());
//System.out.println(sk.pop());
//System.out.println(sk.peek());
//... gives "EmptyStackException" 


 
	}//main

}//class
