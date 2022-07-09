package febbatch;

public class Equalityopt extends Object{

	public static void main(String[] args) {
		
		// Equality operator
		int a=20;     // primitive type
		int b=20;
		int c=10;
		String s="akash";  //non primitive type
		String s1="akash";
		
		Equalityopt obj=new Equalityopt();  // for object
		Equalityopt obj1=new Equalityopt();
		
        System.out.println(a==b);
        System.out.println(b!=c);
        System.out.println(s==s1);
        System.out.println(obj==obj1);
        
        Thread t=new Thread();// object
        
        Object o=new Object();  // object
        System.out.println(obj==o);
        System.out.println(s==o);
   //     System.out.println(s==t);
        
	}

}
