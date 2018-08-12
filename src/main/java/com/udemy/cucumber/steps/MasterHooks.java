package com.udemy.cucumber.steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.udemy.cucumber.utils.DriverFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MasterHooks extends DriverFactory {

	@Before
	public void setup() throws IOException {
		System.out.println("******************MasterHooks.setup()******************");
		driver = getDriver();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		try {
			System.out.println("******************MasterHooks.tearDown()******************");
			
			if(driver!=null && scenario.isFailed())
				scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES),"image/png");
			if(driver!=null)
			driver.quit();
			System.out.println("MasterHooks.tearDown()********************"+driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
