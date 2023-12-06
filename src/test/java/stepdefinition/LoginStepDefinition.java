package stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.*;

import io.cucumber.java.en.*;

public class LoginStepDefinition {

	
	@Given("User enters the URL")
	public void user_enters_the_url() {
		WebDriver driver= new ChromeDriver();		
		driver.get("https://www.saucedemo.com/");
	}

	@Then("User lands on login page of saucelabs")
	public void user_lands_on_login_page_of_saucelabs() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User Enters username {string}")
	public void user_enters_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User Enters password {string}")
	public void user_enters_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should land on home page of saucelabs")
	public void user_should_land_on_home_page_of_saucelabs() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate correct error message should come for UN")
	public void validate_correct_error_message_should_come_for_un() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate correct error message should come for PW")
	public void validate_correct_error_message_should_come_for_pw() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

	@Then("Validate correct error message should come")
	public void validate_correct_error_message_should_come() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on close button")
	public void user_clicks_on_close_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("error message should disappear")
	public void error_message_should_disappear() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
