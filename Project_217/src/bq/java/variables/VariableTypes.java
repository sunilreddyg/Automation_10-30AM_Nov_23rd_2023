package bq.java.variables;

public class VariableTypes 
{
	int a=100;  					//Global Variable [instant Variable]
	static double price=25000.00;	//Global Variable [Static Variable]
	
	public void method1()
	{
		String name="BQ";  //Local variable
		System.out.println(name);
		System.out.println(a);
	}
	
	public void method2()
	{
		System.out.println(a);
		System.out.println(price);
	}

	public static void main(String[] args) 
	{
		//Calling instant method
		new VariableTypes().method1();
		
		//Calling Instant variable
		int x=new VariableTypes().a;
		System.out.println(x);
		
		//Calling static variable
		double newprice=VariableTypes.price;
		System.out.println(newprice);
	}

}
