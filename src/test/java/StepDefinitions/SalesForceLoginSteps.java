package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceLoginSteps {
	WebDriver driver=null;
	@Given("chrome Browser is opened with all necessary options")
	public void chrome_browser_is_opened_with_all_necessary_options() {
		System.out.println("Brower is opened");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));

		driver.manage().window().maximize();
	    
	    
	}

	@Given("User is on the salesforce  login page")
	public void user_is_on_the_salesforce_login_page() {
	    
	}

	@And("user enters the  credentials {string} and {string}")
	public void user_enters_the_credentials_and(String string, String string2) {
	    
	}

	@When("user clicks on the login button to login")
	public void user_clicks_on_the_login_button_to_login() {
	    
	}

	@Then("user lands on the salesforce home page")
	public void user_lands_on_the_salesforce_home_page() {
	    
	}





}
