package executor;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(		
		features = {"src\\test\\resources\\Ecommerc Product Ordering\\"},
		glue= {"stepdefinition"},
		plugin= {"pretty"}
		)
public class TestExecutor {

}
