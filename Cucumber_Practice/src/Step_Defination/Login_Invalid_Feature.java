package Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Invalid_Feature
{
	WebDriver driver;
	@Given("Open Chrome and load webpage")
	public void open_chrome_and_load_webpage() {
		driver=new FirefoxDriver();
		driver.get("http:\\facebook.com");
	}

	@When("user enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() {

		driver.findElement(By.name("email")).sendKeys("kmfdghdjkdj");
		driver.findElement(By.name("pass")).sendKeys("kfdiereir");
		System.out.println("dff");
	}

	@When("Click on LoginButton")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@value='1']")).click();

	}

	@Then("Verifay password error messegedisplayed")
	public void verifay_password_error_messegedisplayed() {
		WebElement error =driver.findElement(By.xpath("//div[@class='_9ay7']"));

		System.out.println(error.getText());
	}

}
