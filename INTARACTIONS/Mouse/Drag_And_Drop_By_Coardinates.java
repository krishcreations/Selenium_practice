package INTARACTIONS.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_By_Coardinates {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

WebElement Handler2=driver.findElement(By.xpath("(//div[contains(@class,'handle')])[1]"));

//Get location Point
int Objx=Handler2.getLocation().getX();

new Actions(driver).dragAndDropBy(Handler2, 100, 0).perform();

WebElement handler1 =driver.findElement(By.xpath("//div[contains(@id,'js-rangeslider-2')]"));
int obj_X =handler1.getLocation().getX();
//System.out.println(obj_X);
new Actions(driver).dragAndDropBy(handler1, -100, 0).perform();

System.out.println("Dragged");
	}

}
