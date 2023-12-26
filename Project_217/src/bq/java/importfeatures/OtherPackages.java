package importfeatures;

import bq.java.methods.instantmethods.ChromeTest;
import bq.java.variables.VariableTypes;

public class OtherPackages 
{


	public static void main(String[] args) 
	{
		
		/*
		 * Inorder to call otherpackage classes and methods
		 * we should follow below rules
		 * 		
		 * 	=> Class,Method,Variable should be declared
		 * 		with public modifier..
		 *  => We should import other package classes
		 *  	 into current class
		 *  
		 *  	Importing Syntax:-->
		 *  
		 *  	package p1;
		 *  	import nameofthepackage .*;
		 *  	import nameofthepackage.Classanme;
		 */
		
		VariableTypes obj=new VariableTypes();
		obj.method1();
		obj.method2();
		
		ChromeTest test=new ChromeTest();
		test.OpenPage();
		test.EnterLogin();
		test.Logout();
		
		

	}

}
