package Runner;


	

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			//"src/test/resources/Features/googleSearch.feature",
			features = {"src/test/resources/Features/testLogin.feature"},
			//tags="@testLogin,@googleSearch",
					stepNotifications = true,
			glue = {"StepDefinitions"},
			plugin = {"pretty",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"timeline:test-output-thread/"})

	public class MyTestRunner {

	}


