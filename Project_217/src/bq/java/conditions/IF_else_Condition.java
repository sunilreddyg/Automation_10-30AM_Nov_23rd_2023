package bq.java.conditions;

public class IF_else_Condition 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * If-else:-->
		 * 		it is a two decision statement
		 */
		
		
		int age=2;
		if (age > 18) 
		{
			System.out.println("Valid Age");
			System.out.println("profile Captured");
		}
		else
		{
			System.out.println("Invalid Age");
		}
		
		
		System.out.println("Run Continued");
		
		
		
		//Two Decision statement
		boolean flag=false;
		if(flag)   //if only accept on true condition
			System.out.println("Active Status");
		else
			System.out.println("Deactivated");
		
		
		//Price
		double price=10000;
		if(price > 100)
		{
			System.out.println("High");
			System.out.println("Accepted");
		}
		else
			System.out.println("invalid");

	}

}
