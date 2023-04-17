package Object_Identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L0gin_With_Xpath {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(@class,'aad7')]")).click();

		
		driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']"))
		.sendKeys("9030248855");
		
		driver.findElement(By.xpath("//input[@name='fullName']"))
		.sendKeys("Newuser");
		
	}

}
