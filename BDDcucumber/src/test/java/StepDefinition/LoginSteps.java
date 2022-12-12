package StepDefinition;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
		@Test
		
	@Given("user Launch Chrome browser")
	public void user_launch_chrome_browser() {
		
	   
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
	  
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {
	   
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	   
	}

	@Then("URL of the page should be {string}")
	public void url_of_the_page_should_be(String string) {
	    
	}

	@Then("close browser")
	public void close_browser() {
	  
	}
}
