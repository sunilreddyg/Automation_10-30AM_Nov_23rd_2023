package bq.java.methods.methodtypes;

public class SelectBook 
{

	public Book1 FirstBook()
	{
		return new Book1();
	}
	
	public Book2 SecondBook()
	{
		return new Book2();
	}
	
	
	public static void main(String[] args) 
	{
		//Create object for Book1
		Book1 b1=new Book1();
		String bname=b1.getName();
		System.out.println("First book name is:--> "+bname);
	}
	

}
