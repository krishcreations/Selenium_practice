package Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Selenium_Outlook_Test {
	WebDriver driver;
	@Given("navigate to outlook page")
	public void navigate_to_outlook_page() {
		driver =new ChromeDriver();
		driver.get("http:\\outlook.com");
		driver.manage().window().maximize();
	}

	@Given("clicking on signin button")
	public void clicking_on_signin_button() {
		driver.findElement(By.xpath("(//a[contains(@data-task,'signin')])[1]")).click();

	}

	@When("user enter invalid email address")
	public void user_enter_invalid_email_address() {
		driver.findElement(By.xpath("(//input[@data-report-trigger='click'])[1]")).sendKeys("krishna1223");

	}
	@When("click on next button")
	public void click_on_next_button() 
	{

		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
	}

	@Then("verify error messege Displayed")
	public void verify_error_messege_displayed() 
	{
		System.out.println("error messege Displayed");
	}

}
