package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Features",
    glue = "stepDefinitions",
    plugin = {"pretty", "html:target/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests 
{
	
}
