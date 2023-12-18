package bq.java.methods.paramters;

public class Multiple_Parameters 
{
	
	//Sequence parameters
	public void method1(String name,String mobile)
	{
		System.out.println(name);
		System.out.println(mobile);
	}
	
	//Other Parameters
	public void method2(int num,String email)
	{
		System.out.println(num);
		System.out.println(email);
	}
	
	//Overloading method  [swapping parameters]
	public void method2(String email,int num)
	{
		System.out.println(num);
		System.out.println(email);
	}

	public static void main(String[] args)
	{
		//Creating class object
		Multiple_Parameters obj=new Multiple_Parameters();
		obj.method1("Sunil", "9030248855");
		obj.method2(100, "info@gmail.com");
	}

}
