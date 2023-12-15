package bq.java.variables.instatiation;

public class Global_initiatioOf_Variable 
{
    static int a;  //global variable
    
	public static void main(String[] args) 
	{
		 System.out.println("A default value is --> "+a);
	     a=100;  //Assigning 100 value to a variable
		 System.out.println("Before "+a);
		 a=200;   //Overring 100 value with 200
		 System.out.println("After "+a);
		 
		 
		//Variable Initiation using condition
		 int x;
		 if(10>9)
		 {
			 x=100;
		 }
		System.out.println(x+500);
		 
		 
		 
		

	}

}
