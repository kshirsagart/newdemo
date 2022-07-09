package practice;

import java.util.Scanner;
public class Factor {

	public static void main(String[] args) {
		
		
		int n,fact=1;    //5=5*4*3*2*1=120
		System.out.println("enter number");
		Scanner ab=new Scanner(System.in);
		n=ab.nextInt();
		
		for(int i=1;i<=5;i++) {
			fact=fact *i;
			
		}
		System.out.println(fact);
		
		
		
	}

}
