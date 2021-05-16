package com.visionit.automation.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.visionit.automation.base.BasePage;
import com.visionit.automation.utils.ElementActions;

public class FetchAllProductPricePage extends BasePage {
	
	private static final Logger logger = LogManager.getLogger(FetchAllProductPricePage.class);
	ElementActions elementActions;
	

	
	//	By Locator
	By dressSelect = By.xpath("//*[@id='block_top_menu']/ul/li[2]/a");
	//By productPrice = By.xpath("//ul[@class='product_list grid row']/li/descendant::span[@class='price product-price']");

	By productPrice = By.xpath("//div[@class='right-block']/div/descendant::span[@itemprop='price']");
	  // Constructor of the page:
			public FetchAllProductPricePage(WebDriver driver) {
				elementActions = new ElementActions(driver);
			}
		
			// Page Actions:
		public String fetchingAllProductPrice() {
         elementActions.doClick(dressSelect);
 		String Dresstext  = elementActions.doGetText(dressSelect);
		return Dresstext;
		
 		

		}	
		
		public List<WebElement> productPrice()
		{
		
			List<WebElement> priceList = elementActions.getElementsList(productPrice);
			return priceList;
		}
		
		

	

}
