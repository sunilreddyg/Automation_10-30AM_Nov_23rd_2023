package datadriven.Excel.Keywords;

public class ReadExcelData_Using_Keywords {

	public static void main(String[] args) {
		
		
		Excel.getexcel("Input.xlsx", "login");
		String Browser=Excel.getCellData(1, 0);
		System.out.println(Browser);

	}

}
