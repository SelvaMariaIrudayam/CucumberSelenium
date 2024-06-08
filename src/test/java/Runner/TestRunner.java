package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/selva/eclipse-workspace/CucumberSelenium/src/test/resources/Features/testLogin.feature",
		glue= {"StepDefinitions"},
		monochrome=false,//color display
		dryRun=false, //compile stepdefintion and feature files,without ruuning it
		plugin= {"pretty","html:target/HTMLReports/htmlreport.html","json:target/JSONReports/jsonreport.json"
				,"junit:target/JunitReports/junitreport.xml"}
		//tags=" @SmokeTest"
		)

public class TestRunner {

}
