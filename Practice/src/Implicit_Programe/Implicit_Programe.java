package Implicit_Programe;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Programe {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		System.out.println("Programme Start");
		System.err.println("error Displayed");
		
		
		
	}

}
