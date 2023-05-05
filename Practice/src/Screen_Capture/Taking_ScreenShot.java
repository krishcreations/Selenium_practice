package Screen_Capture;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Taking_ScreenShot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Create Folder under Project
		FileHandler.createDir(new File("screen_Shot"));

	//Copy File to Project
		FileHandler.copy(src, new File("\\screen_Shot\\img.png"));
	}

}
