package com.Assignment_Automation.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Assignment_Automation.Base.BaseTest;

public class ChangeColor_TC_04 extends  BaseTest {

	private static final Logger logger = LogManager.getLogger(ChangeColor_TC_04.class);

	@Test
	public void tc_004_Change_Image_Color() {
		logger.info("Test case started: tc_004_Change_Image_Color ");
	    boolean checkImageColorChange = changeimgcolor.changeImgColor();
	  	logger.info("Visibility status of Tshirt color change : " + checkImageColorChange);
	  	Assert.assertEquals(checkImageColorChange, true);
		logger.info("Test case ended: tc_004_Change_Image_Color");

}

}