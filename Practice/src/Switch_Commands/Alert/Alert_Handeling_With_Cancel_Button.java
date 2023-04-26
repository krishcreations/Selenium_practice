package Switch_Commands.Alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handeling_With_Cancel_Button {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement Cancel =driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		Cancel.click();
		Thread.sleep(3000);

		WebElement Confirm_Box = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		Confirm_Box.click();
		Thread.sleep(3000);

		String 	Alert_Text =driver.switchTo().alert().getText();
		System.out.println(Alert_Text);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert is Canceled");

	}

}
