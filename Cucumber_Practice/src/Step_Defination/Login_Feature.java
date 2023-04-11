package Step_Defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Feature 
{
	@Given("OpenChrome and load webpage")
	public void open_chrome_and_load_webpage() {
		
		System.out.println("Web page Lodedsuccessfully");
	}

	@When("User enter admin usernmae and password")
	public void user_enter_admin_username_and_password() {
	   System.out.println("username and password entered successfully");
		
	}

	@When("click on Login button")
	public void click_on_login_button() {
		System.out.println("Login button Clicked");
	}

	@When("User enter admin username and password")
	public void user_enter_admin_username_and_password1() {
	}
	@Then("Verify Account Page displayed")
	public void verify_account_page_displayed() {
		System.out.println("Page Displayed Successfully");
	}

	@When("user enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() {
		System.out.println("Entered Invalid Username and Password");
	}

	@Then("Verify error text displayed")
	public void verify_error_text_displayed() {
		System.out.println("Text Displayed");
		
	
	}

}
