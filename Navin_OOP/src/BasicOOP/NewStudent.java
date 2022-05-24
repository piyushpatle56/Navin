package BasicOOP;

public class NewStudent {

	public static void main(String[] args) {
	Student s=new Student();
	/*
	 * s.setNam("piyush"); System.out.println("Student name : "+s.getNam());
	 * 
	 * s.setRollNo(901); System.out.println("Student roll no : "+s.getRollNo());
	 * s.setDiv('B'); System.out.println("Division : "+s.getDiv());
	 * 
	 * System.out.println(" branch : "+Student.branch+ " \n std :  "+ Student.std+
	 * " \n college name :"+ Student.collegeName+
	 * "\n Pincipal : "+Student.principal);
	 */
	System.out.println("______________________");
		
		Student s2= new Student();
		System.out.println(s2.principal);
		System.out.println(s2.branch);
		
		Student s3= new Student();
		System.out.println("s3 branch : "+s3.branch);
		
		s2.branch= "Commerce";  s2.principal= "Narendra Reddy";
		
		System.out.println("s2 branch : "+s2.branch);
		System.out.println("s2-principal : "+s2.principal);
		System.out.println("student branch : "+Student.branch);
		System.out.println("s-principal : "+s.principal);
		System.out.println("s3 branch : "+s3.branch);

		Student s4= new Student();
		System.out.println("s4 branch : " + s4.branch);
		System.out.println("s branch : "+s.branch);
		System.out.println("s2 branch : "+s2.branch);

		System.out.println(" ================== ");
		Student snew= new Student();
		System.out.println("snew branch : "+ snew.branch);
		System.out.println("s2 branch : " +s2.branch);
		System.out.println("s4 branch : " +s4.branch);

		snew.branch= "arts";
		System.out.println("snew branch : "+ snew.branch);
		System.out.println("s2 branch : " +s2.branch);
		System.out.println("s branch : " +s.branch);
System.out.println("_________________");
		Student s99= new Student();
		System.out.println("s99 branch : "+ s99.branch);
		System.out.println("s2 branch : " +s2.branch);
		System.out.println("s branch : " +s.branch);

		System.out.println("principal: "+s2.principal);
		System.out.println("principal: "+s4.principal);
s4.principal= "Advani ";

System.out.println("s99 principal: "+s99.principal);
System.out.println("s4 principal: "+s4.principal);


// Note : the static values remains static by assigned value unless new object gets created
// once new object gets created the static values gets changed to default values of constructor 
		
		
	}// main

}// class
