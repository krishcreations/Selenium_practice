package Switch_Commands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_TryCatch {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement Alertbox =	    driver.findElement(By.xpath("//button[contains(@onclick,'alertbox()')]"));
		Alertbox.click();
		Thread.sleep(3000);

		try {
			//System.out.println(Alertbox.getText());	

			driver.switchTo().alert().accept();
			System.out.println("Alert Is Closed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No Alert");
			e.printStackTrace();
		}
		System.out.println("Run Continued");
	}

}
