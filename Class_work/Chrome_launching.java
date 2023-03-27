package Class_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome_launching {

	public static void main(String[] args) {


		/*
		 * ChromeOptions krish = new ChromeOptions();
		 * krish.addArguments("--remote-allow-origins=*"); WebDriver driver1=new
		 * ChromeDriver(krish); driver1.get("http;//facebook.com");
		 * 
		 */
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(obj);
		driver.get("http://facebook.com");

	}

}
