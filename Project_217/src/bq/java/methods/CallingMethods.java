package bq.java.methods;

public class CallingMethods 
{
	//Instant method
	public void method1()
	{
		method4();
		System.out.println("method1");
	}
	
	//Instant method
	public void method2()
	{
		System.out.println("method2");
	}
	
	//Instant method
	public void method3()
	{
		method1();
		method2();
	}
	
	//static method
	public static void method4()
	{
		//With in class calling instant method inside static method
		new CallingMethods().method1();
		new CallingMethods().method2();
	}
	
	public static void main(String[] args) 
	{
		new CallingMethods().method3();
		/*
		 * Static:-->  Static is a access specifier
		 * 			   => It specifies only static methods allowed
		 * 				to call without object creation. Other than
		 * 				static methods only allowed to call with
		 * 				object creation
		 */
	}

}
