package testRunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
				features = {"src/test/resources/AHP04_CancelBooking.feature"},
				glue = {"StepDef_Adactin", "hooks"},
				snippets = SnippetType.CAMELCASE, 
				plugin = {"pretty", "json:target/cucumber.json", 
									"html:target/htmlreport.html"},
				tags = "@All_Scenarios",
				dryRun = false,
				monochrome = false
				)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}
