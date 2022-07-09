package practice;

import java.util.Scanner;

public class News {

	public static void main(String[] args) {
		
            int n,fact=1;     //5
            System.out.println("enter number");
            Scanner ab=new Scanner(System.in);
            n=ab.nextInt();
            
            for(int i=1;i<=n;i++) 
            {
            	fact=fact *i; 
            }
            
            System.out.println(fact);
            
            
            
            
            
            
	}

}
