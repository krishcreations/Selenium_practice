package Edit_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
	WebElement fname=	driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		fname.sendKeys("krish");
		System.out.println("krish Entered");
		Thread.sleep(3000);
		
		fname.clear();
		fname.sendKeys("krish143");
		
	}

}
