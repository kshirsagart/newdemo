package practice;

public class Wrapper {

	public static void main(String[] args) {
		
		//Wrapper classes is use to convert primitive into object and vice a versa 
		
		//autoboxing means converts a primtive into object
		
		int a=10;
		Integer b=new Integer(a);  //explicit
		Integer c=a;             //autoboxing
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//unboxing means convert object to primitives
		Integer d=new Integer(100);
				int e=d;      //unboxing
		int f=d.intValue();
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
	}

}
