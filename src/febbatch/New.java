package febbatch;  // sum of even or odd digits

import java.util.Scanner;

public class New {

	public static void main(String[] args) {

		int n,i,sum=0;
		System.out.println("enter number");
		Scanner ab=new Scanner(System.in);
		n=ab.nextInt();
		
		if(n%2==0) {
			for(i=0;i<n;i=i+2) {
				sum=sum +i;
				
			}
		System.out.println("even number"+" "+sum);
		}
		else {
			for(i=1;i<=n;i=i+2) {
				sum=sum +i;
		}
		System.out.println("odd number" + sum);
		}
		
	}

}
