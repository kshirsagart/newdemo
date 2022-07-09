package febbatch;

public class Strings {

	public static void main(String[] args) {
		// strings  -non primitives type
		
		String name1="Aman";
		String name2="apu";
		String name3= name1 + name2;
		
		// length
		System.out.println(name1.length());    // length of words
		
		//concate
		System.out.println(name3);     // add two words
		
		//charAt
		
		System.out.println(name1.charAt(0));   // position of words
		System.out.println(name1.charAt(3));   //postion of words 
		                                       // java is a zero index base language
		//replace
		String name4=name1.replace('A','b');
		System.out.println(name4);      // replace character name
                                        // string is a unmutted means value does not change	
		//substring
		String name5="AmanandApu";
		System.out.println(name5.substring(0,4));  // collect of words by using postion
		System.out.println(name5.substring(5,9));
		
		System.out.println(name1.replace("A", "cc"));
		System.out.println(name1.charAt(0));
		System.out.println(name3.endsWith(name2));
	}
	
	

}
