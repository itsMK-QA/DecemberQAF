package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features =  "Feature",
		glue = "com.careerhack.steps"
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
