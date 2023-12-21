package bq.java.methods.methodtypes;

public class Book1 
{
	//Global variables
	private String name="Java";
	private double price=1500.00;
	
	public void printDetails()
	{
		System.out.println("BookName is ---> "+name);
		System.out.print("Book Price is ---> "+price);
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public Discount fifty()
	{
		return new Discount();
	}
	
	
	
	

}
