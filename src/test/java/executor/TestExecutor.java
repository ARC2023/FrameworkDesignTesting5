package executor;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src\\test\\resources\\Ecommerc Product Ordering\\" }, 
		glue = { "stepdefinition","hooks" }, 
		plugin = { "pretty", 
				"rerun:target/failedcases.txt",
				"html:target/cucumber-reports/html",
				"json:target/cucumber-reports/json/report.json",
				"junit:target/cucumber-reports/junit/report.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
		monochrome=false,
		dryRun=false,
		tags="@DataTablesMap"
				
		)
public class TestExecutor {

}
