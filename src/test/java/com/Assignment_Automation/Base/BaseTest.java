package com.Assignment_Automation.Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.Assignment_Automation.pages.ChangeImageColorPage;
import com.Assignment_Automation.pages.EndToEndFeaturePage;
import com.Assignment_Automation.pages.ReviewPage;
import com.Assignment_Automation.pages.SendFriendFeaturePage;
import com.Assignment_Automation.pages.SignUpPage;

public class BaseTest {
	
	public WebDriver driver;
	public Properties prop;
	public BasePage basePage;
	public EndToEndFeaturePage endToendFeatures;
    public SignUpPage signupPage;
    public SendFriendFeaturePage sendfrndRequest;
    public ChangeImageColorPage changeimgcolor;
   
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(@Optional("chrome") String browserName) {
		System.out.println("browserName is : "+ browserName);
		basePage = new BasePage();
		prop = basePage.init_prop();
		prop.setProperty("browser", browserName);
		driver = basePage.init_driver(prop);
		signupPage = new SignUpPage(driver);
		sendfrndRequest = new SendFriendFeaturePage(driver);
		changeimgcolor = new ChangeImageColorPage(driver);
		endToendFeatures = new EndToEndFeaturePage(driver);
	}

	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}

}
