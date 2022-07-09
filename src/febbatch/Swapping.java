package febbatch;   // interchange values 

public class Swapping {

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		
		a=a+b;
		b=a-b;
		a=a-b;
				
    System.out.println(a);
    System.out.println(b);
    
    int k=20;
    int l=10;
    
    k=k+l;  //30
    l=k-l;  //20
    k=k-l;  //10
    System.out.println(k);
    System.out.println(l);
    
}
}