package StepDefinitions;

//https://sites.google.com/chromium.org/driver/capabilities
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class leetLoginSteps {
	WebDriver driver = null;

	@Given("chrome Browser is opened")
	public void chrome_browser_is_opened() {
		System.out.println("Brower is opened");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--disable-notifications");
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-extensions");
		options.setExperimentalOption("excludeSwitches",

				Arrays.asList("disable-popup-blocking", "enable-automation"));
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));

		driver.manage().window().maximize();
	}

	@And("User is on the leetcode login page")
	public void user_is_on_the_leetcode_login_page() throws InterruptedException {
		System.out.println("Inside the step- leetcode login page ");
		driver.get("https://leetcode.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		Thread.sleep(6000);

	}

	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String userName, String passWord) throws InterruptedException {
		Thread.sleep(6000);

		System.out.println("Inside the step- enter name,password ");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement useName = driver.findElement(By.id("//input[@name='login']"));
		wait.until(ExpectedConditions.visibilityOf(useName));
		useName.sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passWord);

	}

	@When("user clicks on sign in btn")
	public void user_clicks_on_sign_in_btn() {
		System.out.println("Inside the step- sigin page ");
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();

	}

	@Then("user lands on the account page")
	public void user_lands_on_the_account_page() {
		System.out.println("Inside the step- account page ");
		boolean visible = driver.findElement(By.xpath("//span[text()='Premium']")).isDisplayed();
		if (visible) {
			System.out.println("User is successfully logged in");
		} else {
			System.out.println("log in failed");
		}
	}

}
