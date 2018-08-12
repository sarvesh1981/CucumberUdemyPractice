package com.udemy.cucumber.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.udemy.cucumber.utils.DriverFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ValidateAuthenticationPopup extends DriverFactory {

	@Given("^application URL having authentication using popup$")
	public void application_URL_having_authentication_using_popup(DataTable url) throws Throwable {
		List<List<String>> urlWithCredential = url.raw();
		driver.get(urlWithCredential.get(0).get(0));
	}

	@Then("^verify the welcome message$")
	public void verify_the_welcome_message(DataTable message) throws Throwable {
		String expectedData=driver.findElement(By.tagName("p")).getText();
		String actualData=message.raw().get(0).get(0);
		Assert.assertEquals(actualData, expectedData);
	}
}
