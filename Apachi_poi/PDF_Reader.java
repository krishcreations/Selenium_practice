package Apachi_poi;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdfparser.PDFStreamParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.hamcrest.core.StringStartsWith;
import org.junit.Assert;
import org.testng.annotations.Test;

public class PDF_Reader {

	@Test
	public void ReadPDFfile () throws Exception {
		File file = new File ("E:\\file-sample_150kB.pdf");
		FileInputStream fis=new FileInputStream(file);
		
		PDDocument pdfdocument=PDDocument.load(fis);
		System.out.println(pdfdocument.getPages().getCount());
		
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		String doctext =pdfTextStripper.getText(pdfdocument);
		Assert.assertTrue(doctext.startsWith("Lorem ipsum"));
		System.out.println(doctext);
				pdfdocument.close();
				fis.close();
				
				
				
	}
	
}
