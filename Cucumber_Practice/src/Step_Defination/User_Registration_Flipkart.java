package Step_Defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User_Registration_Flipkart
{
	@Given("site url as {string}")
	public void site_url_as(String string) {
System.out.println("Url is Opened");
	}

	@Given("click on Register with us")
	public void click_on_register_with_us() {

	System.out.println("Clicked on Registration button");	
	}

	@When("user enter valid mobilenumber {string}")
	public void user_enter_valid_mobilenumber(String string) {

		System.out.println("User Entered Valid Mobile Number-->"+string);
	}

	@When("enter firstname {string}")
	public void enter_firstname(String string) {
System.out.println("User Enter first name -->"+string);
	}

	@When("Enter Surname as {string}")
	public void enter_surname_as(String string) {
System.out.println("Surname Entry Successfull"+string);
	}

	@When("Enter password and retype password {string} and {string}")
	public void enter_password_and_retype_password_and(String string, String string2) {
System.out.println("Password Entered -->"+string);
System.out.println("Retype password entered -->"+string2);
	}

	@When("Enter age as {int}")
	public void enter_age_as(Integer int1) {
System.out.println("Entry Age Complated -->"+int1);
	}

	@When("click on Register")
	public void click_on_register() {
		System.out.println("Click on Register button");

	}

	@Then("verify Successful messege")
	public void verify_successful_messege() {

System.out.println("Account created Successful");
	}
}
