package febbatch;     // methods

public class AllMethods { 
	
	   void money() {              // non static method
		System.out.println("money");   
	   }
	
	static void bank() {       // static method
		System.out.println("bank");
	}
	
	void amont() {                  //void method with non static
		System.out.println("amount");
		
	}
	
	static void cash() {       // void method with static 
		System.out.println("cash");
	}
	
	
	int miss(int i) {       // non void method with non static
		System.out.println("call");
		return 50;
	}
		static int  withdraw(int j) {   // non void method with with static
			System.out.println("withdraw"); 
			return 100;
		}
		
	void app(int i) {       // parametrized method
		System.out.println(i);
	}
		
	void cat() {	    // non paremerised method
	System.out.println();
		
	}
	

	public static void main(String[] args) {
		
		AllMethods obj=new AllMethods();
		obj.money();
		bank();
		obj.amont();
		cash();
		obj.miss(50);
		withdraw(100);
		obj.app(120);
		obj.cat(	);
	}

}
