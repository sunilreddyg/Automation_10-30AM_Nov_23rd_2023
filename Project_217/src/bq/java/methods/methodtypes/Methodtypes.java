package bq.java.methods.methodtypes;


public class Methodtypes 
{

	//Void is a method type it doesn't return any value
	public void method1()
	{
		String name="WebDriver";   //Local Variable
		System.out.println(name);
	}
	
	/*
	 * 1. Other than void all method types return values
	 * 			What is the other method types?
	 * 			=> CallByvalues   [Datatypes [Sring,int,boolean --etc]]
	 * 			=> callByreferences [Classes,Interfaceclass --etc]
	 * 2. We should add return keyword at end of the method
	 * 3. Return value should match with method type
	 * 4. Finally it return value to methodname
	 */
	
	//Method with integer return type
	public int method2()
	{
		return 100;
	}
	
	public int method(int a, int b) 
	{
		int x=a;
		int y=b;
		return x+y;  //+ Operator return boolean value
	}
	
	//Method with boolean return type
	public boolean method3(int x, int y)
	{
		return x>y;  //> Greaterthan operator return boolean value
	}
	
	//Method with double return type
	public double method4(double price)
	{
		return price/2;
	}
	
	//Method with String return type
	public String method5()
	{
		return "WebDriver";
	}

	public static void main(String[] args) 
	{
		//Creating class object
		Methodtypes obj=new Methodtypes();
		obj.method1();
		
		int val=obj.method2();
		System.out.println(val);
		
		int total=obj.method2();
		System.out.println(total);
		
		//Calling Boolean return method
		boolean flag=obj.method3(8, 9);
		System.out.println(flag);
		
		//Calling double return method
		double newprice=obj.method4(23000);
		System.out.println(newprice);

		//Calling String return method
		String name=obj.method5();
		System.out.println(name);
	}

}
