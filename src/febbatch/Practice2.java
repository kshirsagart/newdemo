package febbatch;

public class Practice2 {

	public static void main(String[] args) {
		  //post increment operator
       int a=10;
		int b=10;
		System.out.println(a++); //10
		System.out.println(b++); //10
		System.out.println(a);   //11
		System.out.println(b);   //11
		
		//pre increment operator
		System.out.println(++a);//12
		System.out.println(++b); //12
		System.out.println(a);  //12
		System.out.println(b);  //12
		
		//post decrement operator
		System.out.println(a--);//12
		System.out.println(b--);//12
		System.out.println(a);  // 11
		System.out.println(b);  //11
		
		//pre decrement operator
		System.out.println(--a); //10
		System.out.println(--b); //10
		System.out.println(a);   //10
		System.out.println(b);  //  10
		
		//mixing all in one
		System.out.println(a++ + b++ + ++b + ++a + a + b + b-- + a--);
		//10+10+12+12+12+12+12+12
		
		a++;
		System.out.println(a);
		//12
		b++;
		System.out.println(b);
		//12
	}

}
