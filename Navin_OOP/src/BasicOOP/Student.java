package BasicOOP;

public class Student {
	
int rollno;
String nam;
char div;
		
static  String branch;
static 	int std;
static	String collegeName;
static 	String principal;

public Student() // constructor 
{
	Student.std= 11;
	Student.branch= "Science";
	Student.collegeName= "Modern College";
	Student.principal= "Subhramanium";	
}
public void setNam(String nam) {
	this.nam = nam;
}
public String getNam() {
	return nam;
}
public void setRollNo(int rollno)
{
	this.rollno= rollno;	
}
public int getRollNo()
{
	return rollno;	
}
public void setDiv(char division)
{
	this.div= division;	
}
public char getDiv()
{
	return div;	
}
}
