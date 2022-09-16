package cucumberOptions;

import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "@target/failed_scenarios.txt", 
		glue ="stepDefinations",
		monochrome=true,
		plugin= {"html:target/cucumber.html", "json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failed_scenarios.txt"})
public class FailedTestRunner extends AbstractTestNGCucumberTests{
//	@Override 
//	@DataProvider(parallel=true)
//	public Object[][] scenarios(){
//		return super.scenarios();
//	}
}
