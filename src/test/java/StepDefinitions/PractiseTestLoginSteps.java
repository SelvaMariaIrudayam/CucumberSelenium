package StepDefinitions;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.practiseTestLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseTestLoginSteps {
	public static WebDriver driver = null;
	private practiseTestLoginPage loginPage;

	@Given("chrome Browser is opened with options")
	public void chrome_browser_is_opened_with_options() {
		System.out.println("Brower is opened");
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
//		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		// options.addArguments("--disable-extensions");
//		options.setExperimentalOption("excludeSwitches",
//
//				Arrays.asList("disable-popup-blocking", "enable-automation"));
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));

		driver.manage().window().maximize();
		loginPage=new practiseTestLoginPage(driver);

	}

	@And("User is on the test site login page")
	public void user_is_on_the_test_site_login_page() {
		System.out.println("Inside the step- practicetestautomation login page ");
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

	}

	@When("user enters the  valid credentials {string} and {string}")
	public void user_enters_the_valid_credentials_and(String userName, String passWord) {
		System.out.println("Inside the step- enter name,password ");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passWord);
		loginPage.enterPassWord(userName);
		loginPage.enterPassWord(passWord);
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println("Inside the step- sigin page ");
		//driver.findElement(By.xpath("//button[@id='submit']")).click();
		loginPage.clickLoginBtn();
	}

	@Then("user lands on the practise test automation page")
	public void user_lands_on_the_practise_test_automation_page() {

		System.out.println("Inside the step- account page ");
//		String expectedTitle = "Logged In Successfully | Practice Test Automation";
//		String actualTitle = driver.getTitle();
//		boolean visible = driver.findElement(By.xpath(" //a[contains(text(),'Log out')]")).isDisplayed();
//		if (expectedTitle.equalsIgnoreCase(actualTitle))
//
//		{
//			if (visible) {
//				System.out.println("Success!");
//			} else {
//				System.out.println("Failure!");
//			}
//
//		}
		loginPage.validateTheLogin();
		
	}
	@And("close the browser")
	public void close_the_browser() {
		driver.quit();
	}

}
