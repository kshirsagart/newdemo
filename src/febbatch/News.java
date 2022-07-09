package febbatch;   // odd number in certain  range

import java.util.Scanner;

public class News {

	public static void main(String[] args) {
		
		int n,i;
		System.out.println("enter number");
		Scanner ab=new Scanner(System.in);
		n=ab.nextInt();
		
		for(i=1;i<=n;i=i+2) {    //odd
			
			System.out.println(i);
		}
		 for(i=0;i<=n;i=i+2) {   //even
			 System.out.println(i);
		 }
	}

}
