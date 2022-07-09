package practice;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		int n,count=0;
		System.out.println("enter number");
		Scanner ab=new Scanner(System.in);
		n=ab.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count=count +1;
			}
		}
			if(count==2) {
				System.out.println("Prime number");
			}
			else {
				System.out.println("non prime numbers");
			}
			
		}

	}


