package febbatch;     // sum od numbers=123=6

import java.util.Scanner;

public class Newww {

	public static void main(String[] args) {
		
		//sum of digits
		
		int n,sum=0;
   System.out.println("enter numbers");
   Scanner obj=new Scanner(System.in);
   n=obj.nextInt();
   
   while(n>0) {
	   sum=sum +n%10;
	   n=n/10;
	   
   }
  System.out.println("sum of digits" + sum);
	}
}
