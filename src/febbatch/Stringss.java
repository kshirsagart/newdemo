package febbatch;

public class Stringss {

	
	
	
	
	public static void main(String[] args) {
		String ss="Tushar";      // 
		String ss1=new String("Tushar");  //String with new keyword
		
		String ss3="Akash";
		
		
		
		
      
		Strings a=new Strings();
		
	
		System.out.println(ss==ss1);
		System.out.println(ss.charAt(0));
		System.out.println(ss.equals(ss1));
	//	System.out.println(ss.compareTo(ss2));
		System.out.println(ss.compareTo(ss3));
		System.out.println(ss3.compareTo(ss));
		System.out.println(ss.hashCode());
		System.out.println(ss.concat(ss3));
		System.out.println(ss.toUpperCase());
		System.out.println(ss.toLowerCase());
		System.out.println(ss.compareToIgnoreCase(ss1));
		
		
	}

}
