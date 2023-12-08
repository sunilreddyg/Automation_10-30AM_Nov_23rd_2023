package bq.java.methods;

public class CallingMethods 
{
	
	public void method1()
	{
		System.out.println("method1");
	}
	
	public void method2()
	{
		System.out.println("method1");
	}
	
	public void method3()
	{
		method1();
		method2();
	}
	
	public static void main(String[] args) 
	{
		new CallingMethods().method3();
	}

}
