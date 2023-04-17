package Edit_Box;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_Keys_Example2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	     driver.get("http://facebook.com/reg");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.findElement(By.xpath("//input[@name='firstname']")).
	  sendKeys("krish"+Keys.TAB+"kk"+Keys.TAB+"raja123@gmail.com");
	  
	  //Selecting Dropdown option characters Sequences 
	  driver.findElement(By.xpath("//select[@id='month']")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
	  
	  /*Note:--> Don't use sendkeys method to select dropdown 
	   * options.because Selenium contains separate
	   * methods to select dropdown options 
	   * 
	   */
	  
	
	}

}
