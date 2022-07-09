package febbatch;

public class BitwiseOpe {

	public static void main(String[] args) {
		
		// bitwise operator
		
		boolean i=true;
		boolean j=false;
		boolean k=true;
		boolean l=false;
		
		// And(&)
		System.out.println(i & k);  // true
		System.out.println(i & j);  // false
		System.out.println(j&l);    // false
		System.out.println(j & k);  // false
		
		//or (|)
		System.out.println(i|k);  //true 
		System.out.println(i |j); //true
		System.out.println(j |l); // false
		System.out.println(j| k);  //true
		
		// ^ explosive OR operator   ( ^ explosive symbol
		System.out.println(i^k);  // false
		System.out.println(i^j);  //  true
		System.out.println(j^l);  //false
		System.out.println(j^k);// true
	}

}
