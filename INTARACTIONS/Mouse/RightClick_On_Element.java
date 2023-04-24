package INTARACTIONS.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_On_Element {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//Use Mouse Righ click at location
WebElement element =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral'][contains(.,'right click me')]"));
new Actions(driver).contextClick(element).perform();

	//Use Mouse Click action
WebElement delete = driver.findElement(By.xpath("//li[contains(.,'Delete')]"));
new Actions(driver).click(delete).perform();
	}

}
