package controstatement;

import java.util.Scanner;

public class News {

	public static void main(String[] args) {
		
		int n=9;
		Scanner ref=new Scanner(System.in);
		System.out.println("enter number");
		n=ref.nextInt();
		
        if(n%2!=0) {
        	System.out.println("not prime number");
        }
        	else {
        		System.out.println("prime number");
        	
        }
	}
}

