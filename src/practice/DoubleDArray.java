package practice;

public class DoubleDArray {

	public static void main(String[] args) {
		
		int a[][]=new int[3][3];
		
		a[0][0]=1;
		a[0][1]=2;
        a[0][2]=3;
        a[1][0]=4;
        a[1][1]=5;
        a[1][2]=6;
        a[2][0]=7;
        a[2][1]=8;
        a[2][2]=9;
        
        System.out.println(a.length);
        System.out.println(a[1][2]);
        
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		System.out.print(a[i][j]+"  ");
        	}
        	System.out.println();
        }
        
        int b[][]= {{10,20,30},{40,50,60},{70,80,90}};
        
        System.out.println(b.length);
        
        for(int k=0;k<b.length;k++) {
        	for(int l=0;l<b.length;l++) {
        		System.out.print(b[k][l]+"  ");
        	}
        	System.out.println();
        	
        }
        
        }
	}


