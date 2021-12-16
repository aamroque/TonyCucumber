package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/FeaturesWithTags", glue= {"StepDefinitions"},
monochrome= true,
plugin = {"pretty","html:target/HTMLReports"},
//plugin = {"pretty","json:target/JSONReports/report.json"}
//plugin = {"pretty","junit:target/JUnitReports/report.xml"}

//use tags to run targeted test cases with the attached tags
//use 'or' 'and' 'not' 'and not'
//you can create multiple TestRunners with different combination of Tags
tags={"@SmokeTest or @Regression or @CoreTC"}
)

public class TestRunner_RunWithSingleTag {
	
}
