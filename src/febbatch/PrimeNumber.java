package febbatch;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n,i=1,count=0;
		System.out.println("enter number");
		Scanner ab=new Scanner(System.in);
		n=ab.nextInt();
		//7
	
		while(i<=n) {
			if(n%i==0) 
				count=count +1;
				
				i=i+1;
				
			}
		if(count==2) {
					System.out.println("prime number");
				}else {
				System.out.println("not prime number");		
						
					}
				
			}
		}
			
	


