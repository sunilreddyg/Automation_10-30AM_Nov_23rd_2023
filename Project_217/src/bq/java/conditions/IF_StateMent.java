package bq.java.conditions;

public class IF_StateMent 
{

	public static void main(String[] args) 
	{
		
		/*
		 * IF:--> 
		 * 		if a single decision statement. On True
		 * 		Condition It execute specific block of code
		 */
		
	   //Always print
		System.out.println("Statement1");
		
		int age=19;
		if (age > 18)  
		{
			//Only print on condition true
			System.out.println("Statement2");
		}
		
		//Always print
		System.out.println("Statement3");
		
		
		//If condition with single statement
		double price=500.00;
		if(price > 1000) //False
			System.out.println("High price");  //Only print on condition true
			
	
		//Condition using String
		String name="chrome";
		if(name.equals("chrome")) //True
		{
			System.out.println("browser is matching");
		}
		
	
		
		//If with False
		if(!"IDFC".startsWith("HD"))
			System.out.println("Invalid");
			
	}

}
