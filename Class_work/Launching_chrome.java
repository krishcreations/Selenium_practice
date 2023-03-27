package Class_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launching_chrome {

	public static void main(String[] args) {
  
	
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(obj);
		driver.get("http:/facebook.com");
		
		
	}

}
