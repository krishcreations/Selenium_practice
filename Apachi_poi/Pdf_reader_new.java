package Apachi_poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class Pdf_reader_new
{
	@Test
public void Reader_new () throws Exception
{
  
	File file = new File("E:\\file-sample_150kB.pdf");
	FileInputStream fis =new FileInputStream(file);
	
	PDDocument pdfreader =new PDDocument().load(fis);
	System.out.println(pdfreader.getPages().getCount());
	
	PDFTextStripper pdftextstriper =new PDFTextStripper();
	String document =pdftextstriper.getText(pdfreader);
	System.out.println(document);
	pdfreader.close();
	fis.close();
	
		
}

}
