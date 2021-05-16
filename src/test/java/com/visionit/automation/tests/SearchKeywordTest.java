package com.visionit.automation.tests;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.visionit.automation.base.BaseTest;

public class SearchKeywordTest  extends BaseTest{

	private static final Logger logger = LogManager.getLogger(SearchKeywordTest.class);

	@Test
	
	public void tc_09_Verify_searchKeyord_Dress() {
		logger.info("Test case started: tc_09_Verify_searchKeyord_Dress");
		boolean status = searchkeyword.searchBoxEnabled();
		logger.info("search Box is Enabled:"+status);
	    searchkeyword.SendKeySearchBox();
	  List<WebElement> suggestionList = searchkeyword.getListofSearchBox();
		logger.info("No of product in list : "+suggestionList.size());
		
		for (int i = 0; i <suggestionList.size(); i++) {
	       
			logger.info((i+1) + ". " + suggestionList.get(i).getText());

		}
        logger.info("Test case ended: tc_09_Verify_searchKeyord_Dress");
	}
	
	
	

}