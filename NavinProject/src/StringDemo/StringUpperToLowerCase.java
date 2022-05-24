package StringDemo;

public class StringUpperToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int index; String str= "i love my country";
		 * 
		 * for ( index=0; index<str.length(); index+=1) { switch(index) {case 0:
		 * if(str.charAt(index)>=97 && str.charAt(index)<=122) {
		 * System.out.print((char)(str.charAt(index)-32)); continue; }
		 * 
		 * }// switch
		 * 
		 * if (str.charAt(index)==32) { System.out.print(str.charAt(index)); index=
		 * index+1;
		 * 
		 * if (str.charAt(index)>=97 && str.charAt(index)<=122) {
		 * System.out.print((char)(str.charAt(index)-32)); }
		 * 
		 * }
		 * 
		 * 
		 * else System.out.print(str.charAt(index));
		 * 
		 * 
		 * }// for loop
		 * 
		 */		
	
		/*char sp= ' ';
		String s= "pu ne";
			int a = s.indexOf(sp);
			System.out.println(a);
			int a1=s.indexOf('n',a);
			
			System.out.println(a1);
	
	char c= s.charAt(s.indexOf(' ')+1);
	System.out.println(" char after space : "+ c);
	*/
		
		String s= "PineappleCustardapple";
		String s1= s.replace('p', '$');
		System.out.println(s1);
		
		
		
     int k  =  s.lastIndexOf('x',2);
     
     System.out.println(k);
	
		
	//	System.out.println(s.lastIndexOf('p',4).replace('p', '$') );
		
		
		
	
	}// main

}// class 
