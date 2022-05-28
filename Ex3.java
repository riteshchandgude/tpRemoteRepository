package selenium.practice.java;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Ex3 
{

	public static void main(String []args) throws Exception
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Ravina\\Desktop\\ritesh\\recordings\\Excel\\himym.xls");
		Workbook wb=Workbook.getWorkbook(file);
		Sheet s1=wb.getSheet(0);
		System.out.println(s1.getName());
		int i=2;
		String emppId=s1.getCell(0, i).getContents();
		String empName=s1.getCell(1, i).getContents();
		String emailId=s1.getCell(2, i).getContents();
		String empNo=s1.getCell(3, i).getContents();

		System.out.println("Empolyee ID  "+emppId);
		System.out.println("Empolyee Name  "+empName);
		System.out.println("Email ID  "+emailId);
		System.out.println("Empolyee No  "+empNo);
	
	
	}	

	
	
}
