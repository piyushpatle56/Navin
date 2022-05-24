package BasicOOP;

 class Animal
{
	 void eat()
	 {
	System.out.println("Animal is a "); 
	 }
}
 
 
 
class dog extends Animal
{
	public static void main(String[] args) {
		dog d=new dog();
				d.eat();
				System.out.println("I  love dog");
	}
}