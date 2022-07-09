package febbatch;     // assignment

public class Compoundopt {

	public static void main(String[] args) {
		int a=20;
		
		a+=20;   //a=a+20=40
		System.out.println(a);
		
		a-=10; // a=a-10=30
		System.out.println(a);
		
		a*=2; // a=a*2=60
		System.out.println(a);
		
		a/=2; // a=60/2=30
		System.out.println(a);
		
		a&=10;  // 11110
		        //  01010 =01010      //  true=1  &    false=0
		
		 System.out.println(a);    // &= true+true=true
		
		
		a|=10;  //  1010        // |=false+false= false
		        //  1010=1010
		System.out.println(a);
		
		a^=20; //  01010      // ^= true + true=false
  		       // 10100    =11110   //^=false+false=false
		System.out.println(a);
		
		a<<=2;  // 30*2^2=30*4=120 
		System.out.println(a);
		
		a>>=2; //120/2^2=120/4=30
		System.out.println(a);
		
		
		
	}  

}
