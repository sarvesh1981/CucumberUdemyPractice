package com.udemy.cucumber.pageObject;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.udemy.cucumber.utils.DriverFactory;

import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage{
	
	public ContactUsPage() throws IOException {
		super();
	}
	String parentWindow;
	
	
	@FindBy(id="contact-us")
	WebElement contactUsLink;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="message")
	WebElement message;
	
	@FindBy(id="form_buttons")
	WebElement submitRef;
	
	public void startApp(String appURL) throws InterruptedException {
		driver.get(appURL);
		wait.until(ExpectedConditions.visibilityOf(contactUsLink));
		//Thread.sleep(5000);
	}
	
	public void clickOnContactUsLink() {
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", contactUsLink);
		contactUsLink.click();
		parentWindow=driver.getWindowHandle();		
		for(String temp:driver.getWindowHandles()) {
			driver.switchTo().window(temp);
		}
	}
	
	public void enterDataforContact(String fName,String lName,String emaildata,String comment) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		email.sendKeys(emaildata);
		message.sendKeys(comment);
	}
	
	public void clickSubmit() {
		List<WebElement> inpputTagList=submitRef.findElements(By.tagName("input"));
		System.out.println("inpputTagList size="+inpputTagList.size());
		for(WebElement temp:inpputTagList) {
			if(temp.getAttribute("type").equalsIgnoreCase("submit"))
				temp.click();
		}
		
		
	}
	
	public void closeBrowserInstance() {
		driver.quit();
	}
	
	public void clickReset() {
		List<WebElement> inpputTagList=submitRef.findElements(By.tagName("input"));// wrong locator given in order to capture the report with image of failure
		//if(inpputTagList.size()==0) throw new ElementNotVisibleException("Element Not Found");
		System.out.println("inpputTagList size="+inpputTagList.size());
		for(WebElement temp:inpputTagList) {
			if(temp.getAttribute("type").equalsIgnoreCase("reset"))
				temp.click();
		}
	}
	
}
