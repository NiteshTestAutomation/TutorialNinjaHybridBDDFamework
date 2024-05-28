package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resourcess/features",
                 glue={"stepDefinations" ,"hooks"} )
public class MyRunner {
			
}
