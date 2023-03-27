package Class_work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb_login_check {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("email")).sendKeys("krishman7878778ia@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("898989898989");
		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);

		WebElement err =driver.findElement(By.xpath("//div[@class='_9ay7']"));
		System.out.println(err.getText());


	}

}
