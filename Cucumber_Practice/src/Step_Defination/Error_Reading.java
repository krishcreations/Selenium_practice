package Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Error_Reading {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("http:\\facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("ddnfkjdfjdk");
		driver.findElement(By.name("pass")).sendKeys("dfhkjrk");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		WebElement error =	driver.findElement(By.xpath("//div[@class='_9ay7']"));
		System.out.println(error.getText());


	}

}
