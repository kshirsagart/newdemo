package febbatch;

public class LogicalOperator {

	public static void main(String[] args) {
		
		
		boolean bb= true;
		boolean cc= false;
		
		//Bitwise operator( & | ^)
		System.out.println(bb & cc);   //and  false
		System.out.println(bb || cc);   //or   true
		System.out.println(bb ^cc);     // not  true  
		
		// logical operator (&& ||)
		System.out.println(5>6 &  6>3);// false & true =false
		System.out.println(true & true ||  true  | false);//   true ||  true=true
		System.out.println(true & false ^ false | false);// false ^ false=false
		System.out.println(true| false && false|false);  // true & false=false
	}

}
