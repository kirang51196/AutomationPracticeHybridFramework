package com.Assignment_Automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Assignment_Automation.Base.BasePage;
import com.Assignment_Automation.Utility.ElementActions;

public class ChangeImageColorPage  extends BasePage{
	private static final Logger logger = LogManager.getLogger(ChangeImageColorPage.class);
	ElementActions elementActions;
//	By Locator
	private By selectTshirt = By.xpath("//div[@id='block_top_menu']/ul/li[3]/a");
	private By img = By.xpath("//div[@class='product-image-container']/a/img");
	private By changeColor = By.xpath("//*[@id='color_2']");
	private By blueColorTshirt = By.xpath("//div[@id='image-block']");
	
	// Constructor of the page:
		public ChangeImageColorPage(WebDriver driver) {
			elementActions = new ElementActions(driver);
		}
	
		// Page Actions:
		public boolean changeImgColor() {
		elementActions.doClick(selectTshirt);
		elementActions.doMoveToElement(img);

		elementActions.doClick(changeColor);
		
		
		elementActions.waitForElementVisible(blueColorTshirt);

	    boolean blueShirtDisplay = elementActions.doIsDisplayed(blueColorTshirt);
	     return blueShirtDisplay;
			
		}

}
