package com.visionit.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.visionit.automation.base.BaseTest;

public class ChangeColorTest extends  BaseTest {

	private static final Logger logger = LogManager.getLogger(LandingPageTest.class);

	@Test
	public void tc_012_Change_Image_Color() {
		logger.info("Test case started: tc_012_Change_Image_Color ");
	    boolean checkImageColorChange = changeimgcolor.changeImgColor();
	  	logger.info("Visibility status of Tshirt color change : " + checkImageColorChange);
	  	Assert.assertEquals(checkImageColorChange, true);
		logger.info("Test case ended: tc_012_Change_Image_Color");

}

}