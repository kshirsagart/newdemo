package controstatement;

import java.util.Scanner;
public class Switchh {

	public static void main(String[] args) {
		 int a=20;
		 int b=10;
		 int ch;
		 System.out.println("enter numbers");
		 Scanner ref=new Scanner(System.in);
		 ch=ref.nextInt();
		 
		 
		 switch(ch) {
		 case 1: System.out.println("Addition" + (a+b));
		 break;
		 
		 case 2:System.out.println("Addition" + (a-b));
		 
		 break;
		 default:System.out.println("match");   
		 break;
	}

	}
}