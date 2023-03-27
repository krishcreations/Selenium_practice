package Testng_assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naveen_andco {

	public static void main(String[] args) {
  

//		ChromeOptions obj = new ChromeOptions();
//		obj.addArguments("--remote-allow-origins=*");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://web.whatsapp.com/");
		
	//	driver.findElement(null)
	
			
		
	WebElement msg =	driver.findElement(By.xpath("(//p[contains(@class,'selectable-text copyable-text iq0m558w')])[2]"));
	
	msg.sendKeys("Miss u all");
//	while (msg<100) {
//	
//		msg++;
//		
//	}
//	
	}

}
