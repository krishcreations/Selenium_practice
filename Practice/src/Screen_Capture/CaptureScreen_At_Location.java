package Screen_Capture;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreen_At_Location {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
		
	    
	    //Capturing Screen At Select Location 
	    
	    WebElement Footer_Location = driver.findElement(By.xpath("//div[@class='_ab1y']"));
	    File src =(( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Files.copy(src, new File("screen_Shot\\.img11.png"));
	    
	    System.out.println("success");
	}

}
