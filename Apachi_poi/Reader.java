package Apachi_poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class Reader
{
	@Test
	public void reading() throws Exception {

		File file = new File("E:\\\\file-sample_150kB.pdf");
		FileInputStream fis =new FileInputStream(file);

		PDDocument document = new PDDocument().load(fis);
		System.out.println(document.getPages().getCount());

		PDFTextStripper doc=new PDFTextStripper();
		System.out.println(doc);
		document.close();
		fis.close();



	}

}
