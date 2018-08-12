package com.udemy.cucumber.steps;

import java.util.List;

import com.udemy.cucumber.utils.DriverFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ContactUsSteps extends DriverFactory{
	
	@Given("^enter the given application url$")
	public void enter_the_application_url(DataTable appUrl) throws Throwable {
		List<List<String>> data = appUrl.raw();
		contactPage.startApp(data.get(0).get(0));
	}

	@Given("^click on contact us link$")
	public void click_on_contact_us_link() throws Throwable {
		contactPage.clickOnContactUsLink();
	}

	@Given("^User detail \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" are provided$")
	public void enterInputFieldsValue(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		contactPage.enterDataforContact(arg1, arg2, arg3, arg4);
	}

	@When("^User click on submit button$")
	public void clickSubmitBtn() throws Throwable {
		contactPage.clickSubmit();
	}
	
	@When("^User click on reset button$")
	public void clickResetBtn() throws Throwable {
		contactPage.clickReset();
	}

	@Then("^Validate the confirmation message from app \"([^\"]*)\"$")
	public void validateMessage(String arg1) throws Throwable {
		System.out.println("*********************"+arg1+"**********************");
		//contactPage.closeBrowserInstance();
	}
	
}
