package bq.java.methods;

public class Otherclass 
{

	public void testmethods()
	{
		//Calling instant methods from different class
		//Syntax:--> new classname().methodname();
		new CallingMethods().method1();
		
		//Calling static methods from different class
		//syntax:--> Classname.methodname();
		CallingMethods.method4();
	}

}
