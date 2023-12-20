package bq.java.methods.paramters.CallByReference;


public class GetDetails 
{
	
	public void GetStudentAddress(StudentDetails std)
	{
		std.GetAddress();
	}
	
	public void GetAddress(StudentDetails std)
	{

	}

	public static void main(String[] args)
	{
		GetDetails obj=new GetDetails();
		obj.GetStudentAddress(new StudentDetails());
		

	}

}
