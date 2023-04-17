package Link_Text;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text_Partial_link_Text {

	public static void main(String[] args) throws Exception {
WebDriver driver = new ChromeDriver();
driver.get("http://instagram.com");
driver.manage().window().maximize();
//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

driver.findElement(By.linkText("Locations")).click();
Thread.sleep(3000);
driver.findElement(By.partialLinkText("India")).click();
System.out.println("Success");
		
	}

}
