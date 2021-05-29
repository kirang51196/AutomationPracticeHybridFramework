package com.Assignment_Automation.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Assignment_Automation.Base.BaseTest;
import com.Assignment_Automation.Variables.EndUserVariable;

public class EndToEndFeatures_TC5 extends BaseTest {
	
	private static final Logger logger = LogManager.getLogger(EndToEndFeatures_TC5.class);
    
	@Test
	public  void Verify_EndToEnd_Features_TC_005 () throws InterruptedException{
	logger.info("Test case started:Verify_EndToEnd_Features_TC_005");
	endToendFeatures.CheckEndToEndFeatures();
	logger.info("Test case ended: Verify_EndToEnd_Features_TC_005");

	}
}
