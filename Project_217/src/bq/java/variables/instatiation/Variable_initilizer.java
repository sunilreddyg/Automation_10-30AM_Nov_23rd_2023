package bq.java.variables.instatiation;

public class Variable_initilizer 
{
	//Without Public modifer we can access with in package only
	String url;
	double price=1000.00;
	
	public void methodA()
	{
		System.out.println(url);
	}

	public static void main(String[] args) {
		
		Variable_initilizer obj=new Variable_initilizer();
		obj.url="http://facebook.com";
		obj.methodA();
		
		//Overiding variabel value
		double newprice=obj.price-220;
		System.out.println(newprice);

	}

}
