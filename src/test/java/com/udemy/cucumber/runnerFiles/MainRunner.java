package com.udemy.cucumber.runnerFiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/com/udemy/cucumber/featureFiles"},
		glue= {"com.udemy.cucumber.steps"},
		tags= {"@ValidateSubmit,@ValidateReset"},
		monochrome=true,
		dryRun=false,
		plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)
public class MainRunner extends AbstractTestNGCucumberTests{

}
