package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    System.out.println("inside login page");
	}

	@When("user enters valid Selva and Sel@gamil.com")
	public void user_enters_valid_selva_and_sel_gamil_com() {
	    System.out.println("user enters userName and Password");
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
	    System.out.println("user clicks the login btn");
	}

	@Then("user navigates to the home page")
	public void user_navigates_to_the_home_page() {
	    System.out.println("user is on the home page");
	}

	@When("user enters valid Jeff and Jeff@gmail.com")
	public void user_enters_valid_jeff_and_jeff_gmail_com() {
		 System.out.println("user enters userName and Password");
	}

	@When("user enters invalid <userName> and <passWord>")
	public void user_enters_valid_user_name_and_pass_word() {
	    System.out.println("invalid");
	}

	@Then("user receives the error message")
	public void user_receives_the_error_message() {
	    System.out.println("enter correct values");
	   
	}
	
	



}
