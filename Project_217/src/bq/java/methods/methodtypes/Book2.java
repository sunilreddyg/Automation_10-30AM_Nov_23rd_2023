package bq.java.methods.methodtypes;

public class Book2 
{
	//instant variables
		private String Name="Selenium2";
		private double price=2500.00;
		
		
		//Instant Method
		public void PrintDetails()
		{
			System.out.println(Name+"    "+price);
		}
		
		public String  GetName()
		{
			return Name;
		}
		
		public double GetPrice()
		{
			return price;
		}

}
