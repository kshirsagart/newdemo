package febbatch;            // methods    

public class Methods {
	
	  void bank() {
		  System.out.println("bank");       //non static method
	  }  
		  void bank(int j, int k) {
			  System.out.println(j+k+"   "+"sum"); //non static method  with parameter
		  
	  }

	  
	  static void money() {
		  System.out.println("money");  // static method  
	  }
	public static void main(String[] args) {
		
		Methods mb=new Methods();
		mb.bank();
		
		Methods login=new Methods();
		login.bank(4,5);      // nonstatic method calling with object
		
		money();     // static method calling directly
		
		login.money();  // static method calling with object
		

	}

}
