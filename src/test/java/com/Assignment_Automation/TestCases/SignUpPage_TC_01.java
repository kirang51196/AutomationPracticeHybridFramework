package com.Assignment_Automation.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.Assignment_Automation.Base.BaseTest;
import com.Assignment_Automation.Utility.AppConstants;

public class SignUpPage_TC_01 extends BaseTest {
	
	private static final Logger logger = LogManager.getLogger(SignUpPage_TC_01.class);
	
	@Test
	public void tc_01_verify_new_user_registration_with_newsletter_and_specialOffer_Subscribed() {
		
		logger.info("Test case started: tc_01_verify_new_user_registration_with_newsletter_and_specialOffer_Subscribed");
		
		boolean isUserGotRegistered =signupPage.registerUserInApp(true, true);
		Assert.assertEquals(isUserGotRegistered, true);
		
		logger.info("Test case ended: tc_01_verify_new_user_registration_with_newsletter_and_specialOffer_Subscribed");
	}

	@Test
	public void tc_01_verify_new_user_registration_without_newsletter_and_specialOffer_Subscribed() {
		
		logger.info("Test case started: tc_001_verify_new_user_registration_without_newsletter_and_specialOffer_Subscribed");
		
		boolean isUserGotRegistered =signupPage.registerUserInApp(false, false);
		Assert.assertEquals(isUserGotRegistered, true);
		
		logger.info("Test case ended: tc_001_verify_new_user_registration_without_newsletter_and_specialOffer_Subscribed");
	}

}
