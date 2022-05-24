package AbstractionDemo;

abstract class Panda {
	
	abstract int  sum();
	
}

abstract class Papita extends Panda
{
 public int sum()
	{
		int a= 10;
		int b=20;
		int sum= a+b;
		return sum; 
	}
	
}

class Motu extends Papita
{
	
}