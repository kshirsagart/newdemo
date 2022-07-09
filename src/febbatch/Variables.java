package febbatch;  // variables


public class Variables {
	
	int a=25;    // instance or non static variable or object variable
	static int b=25;    // static variable or class variable
	
	
	void money() {      // local variable with nonstatic method
		int i=50;
	 System.out.println(i);
	
	}
	static void amount() {   // local variable with static variable
		int j=100;
		System.out.println(j);
	}
	
	 public static void main(String[] args) {
		 
		 Variables ab=new Variables();  // instance variable calling with object
		 System.out.println(ab.a);
		 
		 System.out.println(b);    // static variable with direct calling
		 
		 System.out.println(ab.b);  // static variable calling with object
		 
		 ab.money();     // local variable calling with object
		 
		 amount();   // local variable calling directly     
		 
		 
	 }




    
    	
    	
    }