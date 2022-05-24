package CollectionDemo;
import java.util.ArrayList;
import InheritanceDemo.TwoWheelerVehicle;
import InheritanceDemo.Vehicle;
public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList al= new ArrayList();
		al.add(100);
		al.add("singham");
		al.add(false);
		al.add(null);
		al.add('m');
		al.add(19.72f);
		al.add(100);
		al.add("singham");
		
		System.out.println(al);
		al.add(al);
		System.out.println(al);
		ArrayList ax= new ArrayList();
		ArrayList mn= new ArrayList();

		al.add(ax);
		System.out.println(al);
		al.add(mn);
		System.out.println(al);
		al.remove(19.72f);
		System.out.println(al);

		al.add(2,"nilam");
		System.out.println(al);
		System.out.println(" element at 4th position : " +al.get(4));
	
	ax.add(100);
	ax.add("Leo");
	System.out.println(al);
	mn.add(null);
	mn.add(true);
System.out.println(al);
System.out.println(" element at 5th position : " +al.get(5));
System.out.println(" element at 7th position : " +al.get(7));

	System.out.println(al instanceof ArrayList);
	ArrayList kk=null;
	System.out.println(kk instanceof ArrayList);
	mn.add(ax);
	System.out.println(al);
	mn.add(1,"gemini");
	System.out.println(al);

	System.out.println(al.get(2));
	
	Vehicle v= new Vehicle();
	TwoWheelerVehicle two= new TwoWheelerVehicle();
	System.out.println("**************");
	for(Object number : mn)
		System.out.println(" " +number);
	
	System.out.println("________________");
	
	ArrayList<String> str= new ArrayList(3);
	str.add("piyush");
	str.add("pradnya");
	str.add("saksham");
	str.add("shital");
	str.add("bhagya");
	
	
	for(Object number : str)
		System.out.println(" " +number);
	
	ArrayList<Integer> no= new ArrayList();
	no.add(1088);
	no.add(null);
	no.add(9999);
	
	ArrayList<Character> ch= new ArrayList();
	ch.add('&');
	ch.add('n');
	ch.add(null);
	
	
	ArrayList<String> strlist= new ArrayList(3);
	strlist.add("rahul");
	strlist.add("tina");
	strlist.add("scott");
	
	ArrayList<String> list4= new ArrayList<>(3);
	list4.add("ria");
	list4.add("mina");
	
	
	str.addAll(strlist);
	str.addAll(list4);
	System.out.println("******");
	System.out.println(str);
	System.out.println("***!!!!***");
	for(String number: str)
		System.out.println(" "+number);
	System.out.println("!!!");
	System.out.println(str.get(7));
	System.out.println(mn);
	System.out.println(al);
	System.out.println("index of mn collection  : "+ al.indexOf(mn));

	
	 System.out.println("-----");
	 System.out.println(al.getClass());
	 
	}

}
