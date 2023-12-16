package stepdefinition;

import io.cucumber.java.en.*;
import screenshot.ScreenShot;

public class DataDrivenTesting extends ScreenShot{
	@Given("Name of employee {string}")
	public void name_of_employee(String string) {
	    // Write code here that turns the phrase above into concrete actions
	     System.out.println(string);
	}

	@When("salary of employee {string} in step")
	public void salary_of_employee_in_step(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}

	@Then("company of employee {string} in step")
	public void company_of_employee_in_step(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}

	
}
