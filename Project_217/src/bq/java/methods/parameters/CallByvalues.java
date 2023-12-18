package bq.java.methods.paramters;

public class CallByvalues 
{
	//Method with no parameter
	public void methodA()
	{
		System.out.println("No Data");
	}
	
	//Method with int parameter
	public void method1(int num)
	{
		System.out.println(num/2);
	}
	
	//Method with String parameter
	public void method2(String name)
	{
		System.out.println(name);
	}
	
	//Method with boolean parameter
	public void method3(boolean flag)
	{
		System.out.println(flag);
	}
	
	//method with double parameter
	public void method4(double price)
	{
		System.out.println(price);
	}

	public static void main(String[] args) 
	{
		//Create object for class
		CallByvalues obj=new CallByvalues();
		obj.method1(100);     //Calling with integer argument
		obj.method2("HI");	  //Calling with String argument
		obj.method3(true);	  //Calling with boolea argument
		obj.method4(1200.00); //Calling with double argument
	
	}

}
