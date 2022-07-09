package controstatement;

public class Primeno {

	public static void main(String[] args) {
		
		int n=10;
		int flag=0;
		for(int i=2;i<7;i++) {
			
			if(n%i==0){
				System.out.println(n + "not prime number");
				flag=1;
				break;
			}
		}
			if( flag==0) {
				
				System.out.println(n+ "prime number");    
				
				
			}
			
		}
	}


