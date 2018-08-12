package com.udemy.cucumber.utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.udemy.cucumber.pageObject.ContactUsPage;



public class DriverFactory {

	public static WebDriver driver;
	public static ContactUsPage contactPage;;

	public WebDriver getDriver() {
		try {
			ReadConfigFile readConfigFile = new ReadConfigFile();
			String browserType = readConfigFile.getBrowser();
			System.out.println("DriverFactory.getDriver()=" + browserType+", "+driver);
			switch (browserType) {
			case "chrome":
				//if (null == driver) {
					System.out.println("DriverFactory.getDriver()*********inside driver creation****");
					System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
					driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.manage().window().maximize();
				//}
				break;
			case "firefox":
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constants.FIREFOX_DRIVER);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.manage().window().maximize();
				}
				break;

			default:
				System.out.println("Please provide valid Browser Name");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			contactPage= PageFactory.initElements(driver, ContactUsPage.class);
		}
		System.out.println("DriverFactory.getDriver()*************"+driver);
		return driver;

	}

	public static void main(String[] sar) throws IOException {
		DriverFactory df = new DriverFactory();
		System.out.println(System.getProperty("user.dir")
				+ "\\src\\main\\java\\com\\udemy\\cucumber\\properties\\config.properties");
		df.getDriver();
	}
}
