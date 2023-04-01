package Apachi_poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Pdf_Reader2 
{
	@Test
public void Read_pdffile () throws Exception 
{
	
	File file = new File("E:\\\\file-sample_150kB.pdf");
	FileInputStream fis = new FileInputStream(file);
	
	PDDocument pdfdocument =PDDocument.load(fis);
	System.out.println(pdfdocument.getPages().getCount());
	
	PDFTextStripper pdfreader = new PDFTextStripper();
	String document =pdfreader.getText(pdfdocument);
	Assert.assertTrue(document.startsWith("Lorem ipsum"));
	System.out.println(document);
	pdfdocument.close();
	fis.close();
	
	
	
	
}
	
	
}
