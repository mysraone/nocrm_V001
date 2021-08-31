package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		features={".//Features/Login.feature"}, 
		glue={"myStepDefinitions"},
		monochrome=true,		
		plugin={"pretty", 
				"html:target/cucumber-html-report",
				"json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml",
				//"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report9.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				)



public class TestRun {

}
