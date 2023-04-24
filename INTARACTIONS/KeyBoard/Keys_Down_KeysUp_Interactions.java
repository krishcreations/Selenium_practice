package INTARACTIONS.KeyBoard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys_Down_KeysUp_Interactions {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/selectable/default.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		new Actions(driver).keyDown(Keys.CONTROL).perform();
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();


		driver.findElement(By.xpath("//li[contains(.,'Item 4')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 6')]")).click();


	}

}
