package febbatch;

public class IncremOpt {

	public static void main(String[] args) {
		
		int i=10;
		int j=11;
		//increment operator
		//post
		System.out.println(i++); //10(10+1)
        System.out.println(i++);  //11(11+1)
        System.out.println(i);  //12
        System.out.println(i++ +i + i++ + i);
        //12+13+13+14
        
        
        //increment operaor 
        //pre
        System.out.println(++j); //12
       System.out.println(++i); //15
       System.out.println(++j);  //13
       System.out.println(j);//13
       System.out.println(++i + ++j + j +i + ++i);
       //16+14+14+16+17
       
       // decrement operator
       // post
       System.out.println(i--);//17(17-1)
       System.out.println(j--);//14(14-1)
       System.out.println(i);//16
       System.out.println(j);//13
       System.out.println(i-- + j-- + j-- + i);
       //16+13+12+15
       
       //decrement operator
       //pre
       System.out.println(--i); //14
       System.out.println(--j);//10
       System.out.println(j);//10
       System.out.println(--j);//9
       System.out.println(--i + --j + j +i);
       //13+8+8+13
         
       
       //combination
       System.out.println(i++ + j++ + ++i + --j + i++ + j +i + ++i);
       //13+8+15+8+15+8+16+17
       
       
	}

}
