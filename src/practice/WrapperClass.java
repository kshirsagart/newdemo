package practice;

public class WrapperClass {

	public static void main(String[] args) {
		
		
		int i=10;
		Integer obj=new Integer(10);  //boxing
		Integer obj2=i;      //autoboxing
		System.out.println(obj+obj);
		
		
		
		Integer a=new Integer(100);
		int b=a;             //unboxing
		int c=a.intValue();  //
		
		
		System.out.println(b+c);
		
		
		
		
	}
}
