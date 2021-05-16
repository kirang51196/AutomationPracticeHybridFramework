package com.visionit.automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.visionit.automation.base.BasePage;
import com.visionit.automation.utils.ElementActions;
import com.visionit.automation.utils.RandomNumberGeneratorUtil;
import com.visionit.automation.variables.NewsSubcriptionVariable;

public class NewsletterSuscriptionPage  extends BasePage{
	
	private static final Logger logger = LogManager.getLogger(NewsletterSuscriptionPage.class);

	ElementActions elementActions;
	NewsSubcriptionVariable newsubcriptionvariable;

	
	// By Locators - Landing Page
	private By sendEmail = By.id("newsletter-input");
	private By submitBtnClick = By.name("submitNewsletter");
	private By newsSuccesMsg = By.xpath("//p[@class='alert alert-success']");
	
	// Constructor of the page:
	public NewsletterSuscriptionPage(WebDriver driver) {
		elementActions = new ElementActions(driver);
	}
	
	
	
	public String newLetterSubscription() {
		String newUserEmailId =newsubcriptionvariable.getUserNewEmailId();
		elementActions.doSendKeys(sendEmail, newUserEmailId);
        elementActions.doClick(submitBtnClick);
		elementActions.waitForElementVisible(newsSuccesMsg);
		String NewsmailSuccessful = elementActions.doGetText(newsSuccesMsg);
		return NewsmailSuccessful;
	}
		
}
