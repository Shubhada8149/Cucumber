package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDefinition {

	@Before()
	public void setup() {
		System.out.println("Global before");
	}

	//-----------------------------------------------------------------------------------
	
	@Before("@First")
	public void firstbefore()
	{
		System.out.println("Before for first");
	}
	@Given("^Orange HRM application is given$")
	public void orange_HRM_application_is_given() {
		System.out.println("First Given Orange HRM");
	}

	@When("^user is on Orange HRM login page$")
	public void user_is_on_Orange_HRM_login_page() {
		System.out.println("First When Orange HRM");
	}

	@Then("^user can able to login into Orange HRM$")
	public void user_can_able_to_login_into_Orange_HRM() {
		System.out.println("First Then Orange HRM");
	}

	@After("@First")
	public void firstafter()
	{
		System.out.println("After for first");
	}
	
	//--------------------------------------------------------------------------------
	@Before("@Second")
	public void secondbefore()
	{
		System.out.println("Before for second");
	}
	
	@Given("^Facebook application is given$")
	public void facebook_application_is_given() {
		System.out.println("Second given Facebook");
	}

	@When("^user is on facebook login page$")
	public void user_is_on_facebook_login_page() {
		System.out.println("Second when facebook");
	}

	@Then("^user can able to login into Facebook$")
	public void user_can_able_to_login_into_Facebook() {
		System.out.println("Second Then Facebook");
	}

	@After("@Second")
	public void secondafter()
	{
		System.out.println("After for second");
	}
	
	//-----------------------------------------------------------------------
	@Given("^Gmail application is given$")
	public void gmail_application_is_given() {
		System.out.println("Third given gmail");
	}

	@When("^user is on Gmail login page$")
	public void user_is_on_Gmail_login_page() {

		System.out.println("Third when gmail");
	}

	@Then("^user can able to login into Gmail$")
	public void user_can_able_to_login_into_Gmail() {

		System.out.println("Third then gmail");
	}

	@After()
	public void tearDown() {
		System.out.println("Global after");
		System.out.println("Close browser");
	}

}
