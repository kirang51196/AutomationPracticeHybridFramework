package com.visionit.automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.visionit.automation.base.BasePage;
import com.visionit.automation.utils.AppConstants;
import com.visionit.automation.utils.ElementActions;

public class ValidateLogoPage extends BasePage {
	

	//by Locator- Validate Logo
	By landingPageLogoImage = By.xpath("//img[@class='logo img-responsive']");
    By signInPageLink = By.xpath("//div/a[contains(text(),'Sign in')]");
	
	  ElementActions elementActions;
	  
	// Constructor of the page:
		public ValidateLogoPage(WebDriver driver) {
			elementActions = new ElementActions(driver);
		}
	  
		// Page Actions:
		public String ValidateLogoHeight() {
			elementActions.waitForElementVisible(landingPageLogoImage);
		 String LogoHeight = elementActions.getAttributeValue(landingPageLogoImage,"height");
			return LogoHeight;
			
		}
	
		public String ValidateLogoWidth()
		{
			elementActions.waitForElementVisible(landingPageLogoImage);
		 	String LogoWidth = elementActions.getAttributeValue(landingPageLogoImage,"width");
			return LogoWidth;
		}
		
		public String getSignInPageTitle() {
			elementActions.waitForElementClickable(signInPageLink);
			elementActions.doClick(signInPageLink);

			String pageTitle = elementActions.waitForPageTitleToBe(AppConstants.SIGNIN_PAGE_TITLE);
			return pageTitle;
	
		}
		
		
}
