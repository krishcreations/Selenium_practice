package Apachi_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_File {

	public static void main(String[] args) throws IOException {
		
		String path = "Testdata\\Workbook.xlsx";
		FileInputStream fis = new FileInputStream(path);
		System.out.println("file read successfully");
		
		//Target workbook
		XSSFWorkbook book = new XSSFWorkbook();
		
		//Target sheet
		XSSFSheet sht = book.getSheet("Sheet1");
		//target row 
		XSSFRow row =sht.getRow(0);
		//target cell
		XSSFCell cell =row.getCell(0);
		
		//Read text from cell 
		String browsername =cell.getStringCellValue();
		System.out.println(browsername);
		
		//Using Row reference get cell data
		String Username =row.getCell(1).getStringCellValue();
		String password =row.getCell(1).getStringCellValue();
		
		System.out.println(Username+"  "+password);
		String header =sht.getRow(1).getCell(0).getStringCellValue();
		System.out.println(header);
		
	}
	
}
