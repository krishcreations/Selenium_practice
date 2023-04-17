package Launching_browser;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Launching_Chrome_Browser {

	public static void main(String[] args) throws Exception {

		//Open Chrome browser and Strong class
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://instagram.com");
		
		//fetching page title from current page
		String title =driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("E:\\Testing_work_space\\Practice\\SS\\img.jpg"));
		
		System.out.println("ss sussess");
		
	}

}
