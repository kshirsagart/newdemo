package practice;

import java.util.Scanner;

public class Neww {

	public static void main(String[] args) {
		
		int n;
		System.out.println("enter number");
        Scanner ab=new Scanner(System.in);
        n=ab.nextInt();
        
        
        if(n%2==0) {
        	System.out.println("even number");
        }
        else {
        	System.out.println("odd number");
        }
	}

}
