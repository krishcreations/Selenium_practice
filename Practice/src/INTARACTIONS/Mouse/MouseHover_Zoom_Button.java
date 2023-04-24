package INTARACTIONS.Mouse;

import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

public class MouseHover_Zoom_Button {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/zoom/image-magnifier-on-hover.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		//Mouse and  Keyboard interactions...

		WebElement element = driver.findElement(By.xpath("(//a[contains(@class,'vlightbox3')])[4]"));
		new Actions(driver).scrollToElement(element).pause(3000)
		.moveToElement(element).pause(3000).click().perform();
	}
}
