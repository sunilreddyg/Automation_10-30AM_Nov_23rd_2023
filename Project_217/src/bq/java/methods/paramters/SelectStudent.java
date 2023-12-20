package bq.java.methods.paramters;

public class SelectStudent 
{
	String StudentName;
	
	//Constructor with parameter
	public SelectStudent(String name) 
	{
		StudentName=name;
	}
	
	//Method with parameter
	public void  ApplyJob(String Jobname)
	{
		System.out.println(StudentName+" Applied for "+Jobname);
	}
	
	public static void main(String[] args) 
	{
		new SelectStudent("sunil").ApplyJob("java");
		new SelectStudent("Arjun").ApplyJob("Selenium");
	}

}
