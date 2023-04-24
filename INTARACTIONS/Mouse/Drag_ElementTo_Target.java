package INTARACTIONS.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_ElementTo_Target {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://marcojakob.github.io/dart-dnd/basic/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

 WebElement img1 =driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		
 WebElement trash = driver.findElement(By.xpath("//div[@class='trash']"));
// new Actions(driver).dragAndDrop(img1, trash).perform();
		WebElement img2 = driver.findElement(By.xpath("(//img[@class='document'])[2]"));
	//	new Actions(driver).dragAndDrop(img2, trash).perform();

		WebElement img3 = driver.findElement(By.xpath("(//img[@class='document'])[3]"));
		WebElement img4 = driver.findElement(By.xpath("(//img[@class='document'])[4]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(img3, trash).perform();
		action.clickAndHold(img4).moveToElement(trash).release().perform();
		action.clickAndHold(img1).moveToElement(trash).release().perform();
		action.clickAndHold(img2).moveToElement(trash).release().perform();
		
		
	}

}
