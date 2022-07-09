package controstatement;

import java.util.Scanner;

public class Factorr {

	public static void main(String[] args) {
		
     int n;
     int fact=1;
     System.out.println("enter number");
     Scanner ab=new Scanner(System.in);
     n= ab.nextInt();
     
     for(int i=1;i<=n;i++) {
    	 fact=fact*i;
    	 
     }
		
     System.out.println(fact);
		
		
		
	}
	}


