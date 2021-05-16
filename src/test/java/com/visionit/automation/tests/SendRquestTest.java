package com.visionit.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.visionit.automation.base.BaseTest;
import com.visionit.automation.variables.sendKeyDetails;

public class SendRquestTest extends BaseTest{
	
private static final Logger logger = LogManager.getLogger(SendRquestTest.class);
   @Test
   public void tc_01_send_Friend_request() {
	   logger.info("Test case started:tc_01_send_Friend_request ");	

	   String succesMsg =sendfrndRequest.sendFriendRquest();
	   Assert.assertEquals(succesMsg, sendKeyDetails.SuccesFulMsg);
	   
	   logger.info("Test case ended: tc_01_send_Friend_request");

	   
   }
  
	
   
}
