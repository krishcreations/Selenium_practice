package Edit_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();

    //Clicking On button Left Mouse Click
		driver.findElement(By.xpath("(//a[@class='internal sign-in-link'])[2]")).click();
		
		//Type email at Editbox  and Press Enter at keyboard
		
	WebElement email =	driver.findElement(By.name("loginfmt"));
	email.sendKeys("krish1433");
	Thread.sleep(3000);
	email.clear();
	email.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		 Thread.sleep(3000) ;
		
		 //Type Password in Editbox and press enter at keyboard
		 driver.findElement(By.xpath("//input[@id='i0118']")).sendKeys("24343434"+Keys.ENTER);
		 


	}

}
