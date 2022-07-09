package febbatch;

import java.util.Arrays;


public class Array {

	public static void main(String[] args) {
		
		
		
		int []marks=new int[3];   // [] is a subscript operator
		marks[0]=97;               // with integer
		marks [1]=98;
		 marks [2]=95;
		
		
		System.out.println(marks[0]);  // run
		
		
		boolean[] a =new boolean[5];    //with boolean default
		
		a[0]=true;
		
	System.out.println(a[0]);
		
		
		//length
		System.out.println(marks.length);  // length of position  
		System.out.println(a.length);
		//sort
		System.out.println(marks[0]);    // ascending order
		Arrays.sort(marks);
		System.out.println(marks[0]);
	}

}
