package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},
monochrome= true,
plugin = {"pretty","html:target/HTMLReports"}
//plugin = {"pretty","json:target/JSONReports/report.json"}
//plugin = {"pretty","junit:target/JUnitReports/report.xml"}

//use tags to run targeted test cases with the attached tags
//tags="@smoketest"
)

public class TestRunner {
	
}
