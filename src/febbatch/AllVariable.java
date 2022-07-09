package febbatch;

public class AllVariable {
	
	int a=10;                    // instance or nonstatic or object variable
	int l=20 ;
	  
	
	static boolean b=false;    // static variable or class variable   
	
	
	void bank() {
	   int  c=50000;          // local vaiable with nonstatic method
	   
	   System.out.println(c);

}
    static void money() {
    	double d=25411.214d;    // local variable with static method
    	System.out.println(d);
    }
        

public static void main(String[]args){
       	
	AllVariable ab=new AllVariable();
	System.out.println(ab.a);      // instance variable calling with object
	
	System.out.println(b);      // static variable calling with directly
	System.out.println(AllVariable.b); // static variable calling with class
	System.out.println(ab.b);  // static variable calling with ref object
	
	
	ab.bank();    // local variable calling with object
	
	money();      // local variable calling with directly

System.out.println("Hello mumbai");
 

	
}	
}