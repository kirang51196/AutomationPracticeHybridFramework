package com.visionit.automation.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.visionit.automation.base.BasePage;
import com.visionit.automation.utils.ElementActions;
import com.visionit.automation.variables.RegisterPageUserDetails;
import com.visionit.automation.variables.sendKeyDetails;

public class SearchKeywordPage  extends BasePage{
	
	private static final Logger logger = LogManager.getLogger(SearchKeywordPage.class);
   
	ElementActions elementActions;
	
	// By Locators - Landing Page
	By searchBox = By.id("search_query_top");
	By searchDress = By.id("search_query_top");
	By dressList = By.xpath("//div[@class='ac_results']//ul/li");

	
	// Constructor of the page:
		public SearchKeywordPage (WebDriver driver) {
			elementActions = new ElementActions(driver);
		}
	

		public boolean searchBoxEnabled() {
		   elementActions.waitForElementVisible(searchBox);
           boolean status = elementActions.doIsSelected(searchBox);
		   return status;
	   }
		
		public void SendKeySearchBox() {
			elementActions.doActionsSendKeys(searchDress, sendKeyDetails.sendKeysForBox);
			logger.info("Sending keys tosearchBox is : sendKeyDetails.sendKeysForBox" );

		}
		
		public List<WebElement>  getListofSearchBox() {
		List<WebElement> suggestionList = elementActions.getElementsList(dressList);
//
//		logger.info("Total no of suggestion:" +suggestionList.size());
//
//       
//        for(int i=0; i<suggestionList .size(); i++) {
//
//			logger.info((i+1) + ". " + suggestionList.get(i).getText());  	 
////       	 
//         if(suggestionList.contains("Dress")) {
//        	
//  		   break;
//  
//		}
	
		
//}
		

		return suggestionList;
}
		}
