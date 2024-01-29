package bq.java.String;

public class String_Builder {

	public static void main(String[] args) {
		
		/*
		 * What is the differenc between String and StrigBuilder
		 * 
		 * 		=> String is unmutable we can't make changes
		 * 			at runtime
		 * 
		 * 		=> StringBuilder and StringBuffer are 
		 * 			mutable so we can make charactes to string
		 * 			at runtime..
		 */
		
		
		//Append charactes to existing string 
		String surname="Gajjala";
		
		StringBuilder Fullname=new StringBuilder(surname).append(" ").append("Sunil");
		System.out.println(Fullname);
		
		
		//Revers a string using StringBuilder
		StringBuilder builder=new StringBuilder("WebDriver");
		String r=builder.reverse().toString();
		System.out.println(r);
		
		
	}

}
