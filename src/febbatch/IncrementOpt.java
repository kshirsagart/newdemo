package febbatch;

public class IncrementOpt {

	public static void main(String[] args) {
		
		//post increment opt.
		int i=10;
		int j=11;
		
		System.out.println(i);   // 10 
		System.out.println(i++);  // 10(10+1)
	System.out.println(i++);     // 11 (11+1)
	System.out.println(i++ +  j + j++ +j );
	//12+11+11+12   
	
	
	
	// pre increment opt.
	System.out.println(++j);   //13
	System.out.println(j++);   //13(13+1)
	System.out.println(++j);   //15
	System.out.println(++j + ++i + j +i);  
	   // 16+14+16+14
	
	
	// post decrement opt
	System.out.println(i-- + i + j--  + i + i++);
	//14+13+16+13+13
	
	// pre decrement opt
	System.out.println(--i + j-- + -- j + i + j);
	//13+15+13+13+13
	
	}
}