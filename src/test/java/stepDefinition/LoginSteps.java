package stepDefinition;

import DriverFactory.DriverFactory;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	DriverFactory df;
	private LoginPage loginpage= new LoginPage(df.init_driver());
	@Given("Customer is already in homepage")
	public void customer_is_already_in_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("given scenario");
	    String title = loginpage.getLoginTitle();
	    System.out.println(title);
	    
	}

	@When("User add a Cucumber into the Cart")
	public void user_add_a_cucumber_into_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given scenario");
	}

	@When("Click on Cart icon")
	public void click_on_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given scenario");
	}

	@Then("Validate 1kg Cucumber is added to the cart")
	public void validate_1kg_cucumber_is_added_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given scenario");
	}

	@Then("Price is 48rs")
	public void price_is_48rs() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given scenario");
	}



}
