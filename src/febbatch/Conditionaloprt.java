package febbatch;

public class Conditionaloprt {

	public static void main(String[] args) {
		
		int a=(20>10)?40:50;
		int b=(30<10)?40:50;
     int x=(10>20)?30:(40>50)?60:70;
     int y=(10<20)?30:(40<50)?60:70;   // only first condition change
     
     System.out.println(a);
     System.out.println(b);
     System.out.println(x);
     System.out.println(y);
     
     
     
     int c=(20>30)?40:50;
     int d=(20<30)?60:70;
     System.out.println(c);
     System.out.println(d);
	}

}
