package com.visionit.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.visionit.automation.base.BaseTest;
import com.visionit.automation.utils.AppConstants;
import com.visionit.automation.variables.NewsSubcriptionVariable;
import com.visionit.automation.variables.sendKeyDetails;

public class NewsSubscriptionTest extends BaseTest {

private static final Logger logger = LogManager.getLogger(NewsSubscriptionTest.class);
	
	@Test
	public void tc_10_verify_News_Subscription () {
		logger.info("Test case started: tc_16_verify_News_Subscription ");
		
		String NewsmailSuccessful = newsSubscription.newLetterSubscription();
		Assert.assertEquals(NewsmailSuccessful, AppConstants.NewsSubscriptionSuccessMsg);
		logger.info("Test case ended: tc_16_verify_News_Subscription ");

}
}