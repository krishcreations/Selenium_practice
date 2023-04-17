package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Options {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Selecting Dropdown Option Using VisibleText
		new Select(driver.findElement(By.id("month"))).selectByValue("9");
		new Select(driver.findElement(By.id("day"))).selectByValue("13");
		
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1991");
		Thread.sleep(3000);
	}

}
