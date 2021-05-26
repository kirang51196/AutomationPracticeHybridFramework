package com.visionit.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.visionit.automation.base.BasePage;
import com.visionit.automation.base.BaseTest;
import com.visionit.automation.pages.AddToCartPage;

public class UserAddCartTest extends BaseTest{
	
	private static final Logger logger = LogManager.getLogger(UserAddCartTest.class);

	@Test
	public void tc_017_Add_To_Cart_Test() {
		logger.info("Test case started: tc_017_Add_To_Cart_Test");
		String CartValue = addcart.AddToCart();
		logger.info("Added Cart Product value:"+CartValue);
	    logger.info("Test case ended: tc_017_Add_To_Cart_Test");
	    
	}
	
	    @Test
		public void tc_018_Validate_Same_Product_Added_1To_Cart() {
	    logger.info("Test case started: tc_018_Validate_Same_Product_Added_To_Cart");
	    addcart.AddToCart();
        addcart.CheckAddeedItemName();
        logger.info("Added Cart Product NameVisible:");
	    logger.info("Test case ended: tc_018_Validate_Same_Product_Added_To_Cart");
	 }
	    

	    @Test
	  public void tc_019_Validate_Total_Price_Added_To_Cart() {
	  logger.info("Test case started: tc_019_Validate_Total_Price_Added_To_Cart");
	  addcart.AddToCart();
      // addcart.CheckAddeedItemName();
      Double Price = addcart.CheckTotalPrice();
	  logger.info("Added Cart Product TotalPrice:" +Price);
      logger.info("Test case ended: tc_019_Validate_Total_Price_Added_To_Cart");

	    }
//	    
//	    @Test
//		 public void tc_020_Validate_After_Remove_Product_CartValue() {
//		 logger.info("Test case started: tc_020_Validate_After_Remove_Product_CartValue");
//		 addcart.AddToCart();
//		 String AfterRemoverCartValue = addcart.AfterRemovingCheckCartValue();
//		 logger.info("Added Cart Product TotalPrice:"+AfterRemoverCartValue);
//	     logger.info("Test case ended: tc_020_Validate_After_Remove_Product_CartValue");
//
//	    }
}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    


