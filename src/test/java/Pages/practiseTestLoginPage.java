package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practiseTestLoginPage {
	public WebDriver driver;
	private String expectedTitle = "Logged In Successfully | Practice Test Automation";
	@FindBy(xpath="//input[@name='username']")
	@CacheLookup
	private WebElement uname;
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	private WebElement passWord;
	
	@FindBy(xpath="//button[@id='submit']")
	@CacheLookup
	private WebElement loginBtn;
	
	public practiseTestLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	public void enterUserName(String str) {
		uname.sendKeys(str);
		System.out.println("The user name entered");
	}
	public void enterPassWord(String pass) {
		uname.sendKeys(pass);
		System.out.println("The password entered");
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
		System.out.println("The login btn is clicked");
	}
	public void validateTheLogin() {
		if(driver.getTitle().equalsIgnoreCase(expectedTitle)) {
			System.out.println("Login success!");
		}else {
			System.out.println("Login fail!");
		}
	}

}
