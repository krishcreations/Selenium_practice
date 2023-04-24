package INTARACTIONS.Mouse;

import java.awt.event.ActionEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class MouseHover_Action {

	public static void main(String[] args) throws Exception {
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


WebElement mobile = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
mobile.click();
Thread.sleep(3000);

WebElement laptops =driver.findElement(By.xpath("//span[contains(.,'Laptops & Accessories')]"));
new Actions(driver).moveToElement(laptops).perform();

File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
Files.copy(src, new File("E:\\Testing_work_space\\Practice\\amazon.png"));

System.out.println("screenshot success");
	
	
	}

}
