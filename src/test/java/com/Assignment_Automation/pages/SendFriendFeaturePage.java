package com.Assignment_Automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Assignment_Automation.Base.BasePage;
import com.Assignment_Automation.Utility.ElementActions;
import com.Assignment_Automation.Variables.SendFeaturesVariables;

public class SendFriendFeaturePage  extends BasePage{
	
    private static final Logger logger = LogManager.getLogger(SendFriendFeaturePage.class);

	ElementActions elementActions;

	// By Locator -SendRequest
	private By T_shirtBTn = By.xpath("//div[@id='block_top_menu']/ul/li[3]/a");
	private By ProductImgClick=By.xpath("//div[@class='product-image-container']/a/img");
	private By MoreBtn = By.xpath("//a[@title='View']/span");
	private By sendfrndLinkclick = By.xpath("//*[@id='send_friend_button']");
	private By frndName = By.id("friend_name");
	private By frndEmail = By.id("friend_email");
	private By clickonSubmit = By.xpath("//*[@id='sendEmail']/span");
	private By sendmailsusccessMsg = By.xpath("//div[@class='fancybox-inner']/p[1]");
	// Constructor of the page:
		public SendFriendFeaturePage(WebDriver driver) {
			elementActions = new ElementActions(driver);
			}
			
	// Page Actions
			
	public String  sendFriendRquest()		{
		elementActions.doClick(T_shirtBTn);
		logger.info("Click on Tshirt");
    elementActions.doMoveToElement(ProductImgClick);
    elementActions.doClick(MoreBtn);
    elementActions.doClick(sendfrndLinkclick);
    elementActions.doSendKeys(frndName, SendFeaturesVariables.FriendName);
	logger.info("Sent text name as : " +SendFeaturesVariables.FriendName);
	elementActions.doSendKeys(frndEmail, SendFeaturesVariables.FriendEmail);
	logger.info("Sent text name as : " +SendFeaturesVariables.FriendEmail);
	elementActions.doClick(clickonSubmit);
	
	String succesMsg = elementActions.doGetText(sendmailsusccessMsg);
	return succesMsg;
    
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


