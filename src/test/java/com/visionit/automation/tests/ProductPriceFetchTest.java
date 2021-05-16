package com.visionit.automation.tests;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.visionit.automation.base.BaseTest;
import com.visionit.automation.utils.AppConstants;

public class ProductPriceFetchTest extends BaseTest {
private static final Logger logger = LogManager.getLogger(ProductPriceFetchTest.class);
	
	@Test
	public void tc_10_verify_product_Price() {
		logger.info("Test case started: tc_10_verify_product_Price");

		String Dresstext = fetchproductPrice.fetchingAllProductPrice();
		
		Assert.assertEquals(Dresstext, "DRESSES");
		
		List<WebElement> priceList= fetchproductPrice.productPrice();
		logger.info("Product price is: " + priceList.size());
		for(int i=0; i<priceList.size(); i++) {
			logger.info((i+1) + ". " + priceList.get(i).getText());
		}
		
		

		logger.info("Test case ended:tc_10_verify_product_Price ");

	}
		
	
	

}
