package controstatement;     // if else statment

import java.util.Scanner;

public class IfElse {
	
	

	public static void main(String[] args) {
		
		
		int n;
		System.out.println("enter any number");
		
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		 
		if(n>=0)
		{
			System.out.println("+ve number");
		}
		else
		{
			System.out.println("-ve number");
		}
	}

}

