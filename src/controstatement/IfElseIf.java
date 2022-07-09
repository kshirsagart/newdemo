package controstatement;      //  elseif ladder statement                                                 

import java.util.Scanner;
public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int marks;
		System.out.println("enter marks");
		Scanner ref=new Scanner(System.in);
		marks=ref.nextInt();
		
		if(marks>80){
			System.out.println("topper");
		}
		else if(marks<80 && marks>=60) {
			System.out.println("second");
		}
		else {
			System.out.println("third");
		}
	}

}
