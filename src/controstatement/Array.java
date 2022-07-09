package controstatement;

public class Array {

	public static void main(String[] args) {
		
	//	int a[];   // declaration
	//	int []a1;
		
	//	a[]=new int[5];   //instatisation
		//a1[]=new int[3];     
		
		int a[]=new int[5];  
		int []a1=new int[3];  
		
		a[0]=10;    
		a[1]=20;  
		a[2]=30;
		a[3]=40;
		a[4]=50;  
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		System.out.println(a[0]);
		a1[0]=18;
		a1[1]=20;
		a1[2]=22;
		
		 System.out.println(a1[2]); 
	}

}
