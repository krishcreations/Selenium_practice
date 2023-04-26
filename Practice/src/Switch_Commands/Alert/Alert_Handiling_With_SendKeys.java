package Switch_Commands.Alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handiling_With_SendKeys {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement Alert_With_TextBox =driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		Alert_With_TextBox.click();
		Thread.sleep(3000);


		WebElement btn =driver.findElement(By.xpath("//button[contains(@class,'btn btn-info')]"));
		btn.click();
		Thread.sleep(3000);
		
	//	String Alert_Txt =	driver.switchTo().alert().getText();

	//	System.out.println(Alert_Txt);

		Alert alert = driver.switchTo().alert();

		
		alert.sendKeys("Krish123");
		Thread.sleep(3000);
		System.out.println(alert);
		alert.accept();
		driver.quit();
		System.err.println("Wrong");
	}

}
