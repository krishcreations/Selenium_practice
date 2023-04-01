package Apachi_poi;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_from_NumaricCell {

	public static void main(String[] args) throws IOException {

		FileInputStream fi = new FileInputStream("Apachi_excel_file\\Numaric_cell.xlsx");
		System.out.println("file read successfully");

		//Get Excel workbook using above location

		XSSFWorkbook book = new XSSFWorkbook(fi);
		
		//get sheet access using book reference 
		XSSFSheet sht =    book.getSheetAt(0);
		//target row using sht reference 
        XSSFRow row =sht.getRow(1);
        
        // get cell value 
        double sn_in_dble =row.getCell(0).getNumericCellValue();
        System.out.println("Serial number in double -->"+sn_in_dble);

        //converting double value int value
        int sn_in_num = new Double(sn_in_dble).intValue();
        System.out.println("Serial number  in Numaric "+sn_in_num);
        //converting double value into text 
        String sn_in_text =NumberToTextConverter.toText(sn_in_num);
        System.out.println("Serial number in text format-->"+sn_in_text);
        
        //get price value from excel cell
        
        double pricein_Dble =row.getCell(2).getNumericCellValue();
        System.out.println("price value is -->"+pricein_Dble);
	}

}
