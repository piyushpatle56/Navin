package OneDimensionalArray;

public class OneDimensionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] a= new char [] 
				
	{'a','b','c', 'b', 'm', 'b','c'};
		
		char dupvalue[]= new char[a.length];
		char [] dup= new char[a.length];
		
	for (int k=0; k<a.length; k++)  // copy to dup array 
	dup[k]= a[k];
	
  for (int i=0; i<a.length; i++) 
  { 
					// i for a  // j for dup // k for empty -- store duplicate
	  for (int j=i+1; j<a.length; j++) 
	  	{ 
		  	if (a[i]== dup[j])
		  	 dupvalue[i]=a[i]; 
		  				
		  }
		  											
} // for loop 
 // printing dupvalue 
	
	for (int i=0; i<a.length; i++)
		if(dupvalue[i]!=0)
		System.out.println(dupvalue[i]);

	
	//System.exit(0);
		
		// copy all elements from one array to another 
		/*
		 * String[] names = new String[] { "Piyush", "Saksham", "Bhagyashri", "Pradnya",
		 * "Shital", "Arati", "kaushal" };
		 * 
		 * String[] duplicate= new String[names.length];
		 * 
		 * System.out.println("Duplicate array length: "+duplicate.length+"\n\n");
		 * 
		 * for (int i=0; i<names.length; i++)
		 * 
		 * duplicate[i]= names[i];
		 * 
		 * 
		 * for (int i=0; i<duplicate.length; i++) {
		 * 
		 * if (i%2==0) System.out.println("a["+i+"] " +duplicate[i]);
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
