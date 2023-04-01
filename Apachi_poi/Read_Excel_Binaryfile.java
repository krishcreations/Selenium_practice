package Apachi_poi;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_Binaryfile {

	public static void main(String[] args) {

		FileInputStream fi =null;

		try {

			fi = new FileInputStream("E:\\Testing_work_space\\Testing_project_001\\Apachi_excel_file\\Numaric_cell.xlsx");


		} catch (Exception e) {
			e.printStackTrace();
		}
		if (fi!=null) {
			System.out.println("file read successfully");
			XSSFWorkbook book;
			try {
				book = new XSSFWorkbook(fi);
				String Browsername =		book.getSheet("config").getRow(1).getCell(0).getStringCellValue();
				System.out.println(Browsername);
			} catch (Exception e){
				e.printStackTrace();


			}
		}

		else {
			System.out.println("File reading failed");

		}

	}

}


