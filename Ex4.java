package selenium.practice.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex4
{
 
	public static void main(String []args) throws Exception
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Ravina\\Desktop\\ritesh\\recordings\\Excel\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet st=wb.getSheet("test");
		System.out.println(st.getSheetName());
		
		System.out.println("Before Using sheet data 2nd row nd 1st col = "+st.getRow(2).getCell(1));
		
		XSSFCell cell=st.getRow(2).getCell(1);
		
		cell.setCellValue("Naveen");
		file.close();
		FileOutputStream file1=new FileOutputStream("C:\\Users\\Ravina\\Desktop\\ritesh\\recordings\\Excel\\Book1.xlsx");
		wb.write(file1);
		System.out.println("After Using sheet data 2nd row nd 1st col = "+cell.getStringCellValue());
		file1.close();
	}
	
	
	
	
	
	
}
