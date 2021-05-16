package com.visionit.automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.visionit.automation.base.BasePage;
import com.visionit.automation.utils.ElementActions;
import com.visionit.automation.variables.sendKeyDetails;

public class SendFriendRequestPage  extends BasePage{
	
    private static final Logger logger = LogManager.getLogger(LandingPage.class);

	ElementActions elementActions;

	// By Locator -SendRequest
	By T_shirtBTn = By.xpath("//div[@id='block_top_menu']/ul/li[3]/a");
	By ProductImgClick=By.xpath("//div[@class='product-image-container']/a/img");
    By MoreBtn = By.xpath("//a[@title='View']/span");
	By sendfrndLinkclick = By.xpath("//*[@id='send_friend_button']");
	By frndName = By.id("friend_name");
	By frndEmail = By.id("friend_email");
	By clickonSubmit = By.xpath("//*[@id='sendEmail']/span");
	By sendmailsusccessMsg = By.xpath("//div[@class='fancybox-inner']/p[1]");
	// Constructor of the page:
			public SendFriendRequestPage(WebDriver driver) {
				elementActions = new ElementActions(driver);
			}
			
	// Page Actions
			
	public String  sendFriendRquest()		{
		elementActions.doClick(T_shirtBTn);
		logger.info("Click on Tshirt");
    elementActions.doMoveToElement(ProductImgClick);
    elementActions.doClick(MoreBtn);
    elementActions.doClick(sendfrndLinkclick);
    elementActions.doSendKeys(frndName, sendKeyDetails.FriendName);
	logger.info("Sent text name as : " +frndName );
	elementActions.doSendKeys(frndEmail, sendKeyDetails.FriendEmail);
	logger.info("Sent text name as : " +frndEmail );
	elementActions.doClick(clickonSubmit);
	
	String succesMsg = elementActions.doGetText(sendmailsusccessMsg);
	return succesMsg;
    
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
