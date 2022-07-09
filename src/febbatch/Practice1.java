package febbatch;

public class Practice1 {

	public static void main(String[] args) {
		int a=20;
		int b=10;
		//arithmetic operator
		System.out.println(a+b);  //addition
		System.out.println(a-b);  // substraction
		System.out.println(a*b);  // multiplication
		System.out.println(a/b);  //division 
		System.out.println(a%b);  //module

		//relational operator values in true and false
		System.out.println(a==b);  //false
		System.out.println(a!=b);  //true
		System.out.println(a>b);   //true
		System.out.println(a<b);   //false
		System.out.println(a>=b);  //true
		System.out.println(a<=b);  //false
		
		//logical operator  for boolean data type
		boolean c=true;
		boolean d=false;
		boolean e=true;
		boolean f=false;
		// && operator
		System.out.println(c && d ); //false
		System.out.println(c&& e);   // true
		System.out.println(c && f);  //false
		System.out.println(d && f);  //false
		
		// ||(or) operator
		System.out.println(c || d); //true
		System.out.println(c || e); //true
		System.out.println(c || f); //true
		System.out.println(d || f); //false
		
		// ^||(explosive or) operator
		System.out.println(c^d); //true
		System.out.println(c^e); //false 
		System.out.println(c^f); //true 
	    System.out.println(d^f); //false 	
		
	}

}
