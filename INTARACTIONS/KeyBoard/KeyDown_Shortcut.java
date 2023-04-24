package INTARACTIONS.KeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_Shortcut {

	public static void main(String[] args) throws Exception {

		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.jqueryscript.net/demo/keyboard-shortcut-handling/");
		   driver.manage().window().maximize();
		
		new Actions(driver).keyDown(Keys.ALT).sendKeys(Keys.F1).perform();
		Thread.sleep(3000);
		
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();
}
	}


