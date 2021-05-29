package com.Assignment_Automation.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Assignment_Automation.Base.BaseTest;
import com.Assignment_Automation.Variables.SendFeaturesVariables;

public class SendFeatureTestCase_02 extends BaseTest{
	
private static final Logger logger = LogManager.getLogger(SendFeatureTestCase_02.class);
   @Test
   public void tc_01_send_Friend_Feature() {
	   logger.info("Test case started:tc_02_send_Friend_request ");	

	   String succesMsg =sendfrndRequest.sendFriendRquest();
	   Assert.assertEquals(succesMsg, SendFeaturesVariables.SuccesFulMsg);
	   
	   logger.info("Test case ended: tc_02_send_Friend_request");

	   
   }
  
	
   
}
