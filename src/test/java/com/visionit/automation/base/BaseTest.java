package com.visionit.automation.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.visionit.automation.pages.AddToCartPage;
import com.visionit.automation.pages.ChangeImageColorPage;
import com.visionit.automation.pages.FetchAllProductPricePage;
import com.visionit.automation.pages.LandingPage;
import com.visionit.automation.pages.NewsletterSuscriptionPage;
import com.visionit.automation.pages.RegisterPage;
import com.visionit.automation.pages.SearchKeywordPage;
import com.visionit.automation.pages.SendFriendRequestPage;
import com.visionit.automation.pages.SocialMediaPages;
import com.visionit.automation.pages.ValidateLogoPage;

public class BaseTest {
	
	public WebDriver driver;
	public Properties prop;
	public BasePage basePage;
	public LandingPage landingPage;
	public RegisterPage registerPage;
	public SocialMediaPages socialMediaPages;
	public ValidateLogoPage validateLogo;
    public SearchKeywordPage searchkeyword;
    public SendFriendRequestPage sendfrndRequest;
    public ChangeImageColorPage changeimgcolor;
    public FetchAllProductPricePage fetchproductPrice;
    public NewsletterSuscriptionPage newsSubscription;
    public AddToCartPage addcart;
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(@Optional("chrome") String browserName) {
		System.out.println("browserName is : "+ browserName);
		basePage = new BasePage();
		prop = basePage.init_prop();
		prop.setProperty("browser", browserName);
		driver = basePage.init_driver(prop);
		landingPage = new LandingPage(driver);
		registerPage = new RegisterPage(driver);
		socialMediaPages = new SocialMediaPages(driver);
		validateLogo= new ValidateLogoPage(driver);
		searchkeyword = new SearchKeywordPage(driver);
		sendfrndRequest = new SendFriendRequestPage(driver);
		changeimgcolor = new ChangeImageColorPage(driver);
		fetchproductPrice = new FetchAllProductPricePage(driver);
		newsSubscription = new NewsletterSuscriptionPage(driver);
		addcart = new AddToCartPage(driver);
	}

	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}

}
