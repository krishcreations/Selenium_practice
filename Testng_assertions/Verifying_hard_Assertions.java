package Testng_assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verifying_hard_Assertions {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("email")).sendKeys("karthik1ghh@gmial.com");
		driver.findElement(By.name("pass")).sendKeys("7661837ggh66");
		driver.findElement(By.name("login")).click();
		
		WebElement error = driver.findElement(By.xpath("//div[contains(@class,'9ay7')]"));

		System.out.println(error.getText());
		
		
		
		
		
		
	}
	

}
