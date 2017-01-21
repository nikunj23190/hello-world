package steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		format={"pretty"},
		monochrome = true,
		glue = {"steps"},
		features = "src/test/java/features"
      //  tags = {"~@ignore", "~@to-implement", "~@random-failure", "~@broken"}, 
		//strict = true
	 ,dryRun = false
		)

public class RunFeatures {

	
}
