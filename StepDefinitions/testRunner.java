package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\2308528\\eclipse-workspace1\\IdentifyNewBikes_Hackathon\\FeatureFiles\\login.feature", glue = "stepDefinition", plugin = { "pretty",
		"html:reports/myCucumberReport.html" })
public class testRunner {

}