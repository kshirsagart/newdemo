package febbatch;

public class ReturnType {
	
	int withdrawBalance(int i)       {//if data type along with method called as return type
		
		System.out.println("hello"); 
	   return i;
	}

	public static void main(String[] args) {
			
		ReturnType login=new ReturnType();
		login.withdrawBalance(5); //calling int return type method
		
		System.out.println(login.withdrawBalance(10));//calling int return type method and
		                                               // print value method
		
	
		

	}

}
