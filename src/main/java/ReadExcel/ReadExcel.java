package ReadExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String filepath="C:\\Users\\Vivek\\Desktop\\Data.xlsx";
readdata(filepath);
	}

	private static void readdata(String filepath) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis= new FileInputStream(filepath);
	XSSFWorkbook workbook= new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheetAt(0);
	/*
	 * Row row=sheet.getRow(0); Cell cell=row.getCell(0); System.out.println(cell);
	 */
	int lastRow = sheet.getLastRowNum();
	for(int i=1;i<=lastRow;i++)
	{
		String username= sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(username);
	}
	
	}

}
