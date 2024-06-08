package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	WebDriver driver = null;

	@Given("Browser is opened")
	public void browser_is_opened() {
		System.out.println("Brower is opened");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));

		driver.manage().window().maximize();

	}

	@And("user is on the search page")
	public void user_is_on_the_search_page() {
		System.out.println("Inside the step- the Search ");
		driver.get("https://www.google.com/");

	}

	@When("user enters a text on the search box")
	public void user_enters_a_text_on_the_search_box() throws InterruptedException {
		System.out.println("inside the step-enter text");
		String searchStr = "automation step by step.com";
		System.out.println("user enters  " + searchStr + " in the search box");
		driver.findElement(By.xpath("//textArea[@title='Search']")).sendKeys(searchStr);
		Thread.sleep(5000);

	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("inside the step -hits enter");
		driver.findElement(By.xpath("//textArea[@title='Search']")).sendKeys(Keys.ENTER);

	}

	@Then("user is navigated to the search result page")
	public void user_is_navigated_to_the_search_result_page() {
		System.out.println("inside the step-search result page");
		if(driver.getPageSource().contains("Online Courses")) {
			System.out.println("Landed on the correct page;The test passed;");
		}else {
			System.out.println("Test failed");
		}
		driver.quit();
	}

}
