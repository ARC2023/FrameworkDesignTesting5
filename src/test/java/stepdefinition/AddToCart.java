package stepdefinition;

import io.cucumber.java.en.*;
import screenshot.ScreenShot;

public class AddToCart extends ScreenShot{
	@When("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Successful1");
		driver.get("https://www.naukri.com/nlogin/login?msg=0&URL=https%3A%2F%2Fmy.naukri.com%3A80%2Fmynaukri%2FRecruiter%2Fview");
	}

	@Then("product is moved to cart")
	public void product_is_moved_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Successful2");
	}

	@When("user clicks on add to cart for another product")
	public void user_clicks_on_add_to_cart_for_another_product() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Successful3");
	}

	@Then("multiple product is moved to cart")
	public void multiple_product_is_moved_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	     System.out.println("Successful4");
	}

}
