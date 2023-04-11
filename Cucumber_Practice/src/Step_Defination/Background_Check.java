package Step_Defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background_Check
{
	@Given("Navigating to page")
	public void navigating_to_page() {
		System.out.println("All Precondition Setup");

	}

	@When("book1 is selected")
	public void book1_is_selected() {
System.out.println("Book1 is Selected");
	}

	@Then("check Author of Book is {string}")
	public void check_author_of_book_is(String string) {

		System.out.println("Book1 Author name is -->"+string);
	}

	@When("book2 is selected")
	public void book2_is_selected() {
System.out.println("Book2 is Selected");
	}

	@Then("Check Author of book2 is {string}")
	public void check_author_of_book2_is(String string) {
System.out.println("Book2 Author name is -->"+string);
	}

	@When("book3 is selected")
	public void book3_is_selected() {
System.out.println("Book3 is selected");
	}

	@Then("Check Author of book3 is {string}")
	public void check_author_of_book3_is(String string) {
System.out.println("book3 Author name is -->"+string );
	}
}

