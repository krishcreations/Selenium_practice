package Switch_Commands.Alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_Ok_Button {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement Alert =		driver.findElement(By.xpath("//button[@onclick='alertbox()']"));

		Alert.click();
		Thread.sleep(3000);
		//Getting text from alert
		String alertmsg =	driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		//Press ok button at alert 
		driver.switchTo().alert().accept();

	}

}
