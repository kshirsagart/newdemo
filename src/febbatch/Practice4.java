package febbatch;

public class Practice4 {

	public static void main(String[] args) {
		//compound assignment operator
		int a=10;
		
		a+=10; // a=a+10=20
		System.out.println(a);
		
		a-=15; // a=a-15=5
		System.out.println(a);
		
		a*=2; // a=a*2=5*2=10
		System.out.println(a);
		
		a/=2; // a=a/2=10/2=5
		System.out.println(a);
		
		a%=2; //a=5%2=1
		System.out.println(a);
		
		a&=10; // 0001
		       // 1010
		       //=0000
		System.out.println(a);
		
		a|=10; //0000 
		       //1010
		       //=1010
		System.out.println(a);
		
		a^=10; //1010
		       //1010
		       //=0000
		System.out.println(a);
		
		a<<=4;  //0*2^4=0
		System.out.println(a);
		
		a>>=2;  //0/2^2=0
		System.out.println(a);
		
		
		
		
	}

}
