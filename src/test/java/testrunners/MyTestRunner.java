package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/features"},
		glue = {"src/test/java/stepdefinitions", "appHooks"},
		monochrome = true,
		plugin = {"pretty"}
		)
public class MyTestRunner {

}
