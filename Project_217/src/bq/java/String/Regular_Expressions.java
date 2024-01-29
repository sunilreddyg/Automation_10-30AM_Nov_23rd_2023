package bq.java.String;

public class Regular_Expressions {

	public static void main(String[] args) {
		
		// a regex pattern for
	    // four letter string that starts with 'J' and end with 'a'
	    String regex = "^J..a$";

	    System.out.println("Java".matches(regex));
	    
	    
	    //Numbers pattern
	   // a search pattern for only numbers
	    String regex1 = "^[0-9]+$";

	    System.out.println("123a".matches(regex1)); // false
	    System.out.println("98416".matches(regex1)); // true
	
	
	}

}
