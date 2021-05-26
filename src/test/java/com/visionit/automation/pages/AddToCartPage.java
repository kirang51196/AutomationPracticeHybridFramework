package com.visionit.automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.visionit.automation.base.BasePage;
import com.visionit.automation.utils.ElementActions;
import com.visionit.automation.utils.WaitUtil;

public class AddToCartPage extends BasePage {
	private static final Logger logger = LogManager.getLogger(AddToCartPage.class);
	ElementActions elementActions;
	WaitUtil wait;
	
   //	By Locator
	By Tshirt = By.xpath("//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img");
	By Blouse = By.xpath("//*[@id='homefeatured']/li[2]/div/div[1]/div/a[1]/img");
	By PrintedDress = By.xpath("//*[@id='homefeatured']/li[3]/div/div[1]/div/a[1]/img");
	By addBtn1 = By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span");
	By addBtn2 = By.xpath("//*[@id='homefeatured']/li[2]/div/div[2]/div[2]/a[1]/span");
	By addBtn3 =  By.xpath("//*[@id='homefeatured']/li[3]/div/div[2]/div[2]/a[1]/span");
	By ContinueShoppingClick = By.xpath("//span[@title='Continue shopping']");
	By TotalProductAddedToCart = By.xpath("//div[@class='shopping_cart']/a");
	
	//Tc 18
   By CheckCartItem = By.xpath("//a[@title='View my shopping cart']");
	
  // Tc 19
   By CartBtn= By.xpath("//div[@class='col-sm-4 clearfix']/div/a");
   By AddedItemPrice = By.xpath("//div[@id='page']/div/descendant::span[@class='price cart_block_total ajax_block_cart_total']");
 
   //Tc 20 
   By removeProduct = By.xpath("//dt[@data-id='cart_block_product_1_1_0']/span/a");
   By checkCartValue = By.xpath("//div[@id='page']/div/descendant::a[@title='View my shopping cart']");
   
   
	
	
  
	
	    // Constructor of the page:
			public AddToCartPage(WebDriver driver) {
				elementActions = new ElementActions(driver);
			}
		
			// Page Actions: tc 17
			public String AddToCart() {
				elementActions.doMoveToElement(Tshirt);	
				elementActions.doClick(addBtn1);
				elementActions.doClick(ContinueShoppingClick);

				elementActions.doMoveToElement(Blouse);
				elementActions.doClick(addBtn2);
				elementActions.doClick(ContinueShoppingClick);

				elementActions.doMoveToElement(PrintedDress);
				elementActions.doClick(addBtn3);
				elementActions.doClick(ContinueShoppingClick);
				
				//elementActions.doClick(TotalProductAddedToCart);
				//elementActions.waitForElementVisible(TotalProductAddedToCart);
				String CartValue = elementActions.doGetText(TotalProductAddedToCart);
				return CartValue;

		}
			
			//tc 18
	  public void CheckAddeedItemName() {
	 elementActions.doMoveToElement(CheckCartItem);
	   wait.mediumWait();
	  }
	  
	  //tc 19
	  public Double CheckTotalPrice() {
		 elementActions.doMoveToElement(CartBtn);
    Double Price = Double.parseDouble(elementActions.doGetText(AddedItemPrice));
		return Price;
		 
	  }
	  
	  //tc 20
	  public String AfterRemovingCheckCartValue() {
		  elementActions.doMoveToElement(CheckCartItem);
		  elementActions.doClick(removeProduct);
		 String AfterRemoverCartValue = elementActions.doGetText(checkCartValue);
		
		 return AfterRemoverCartValue;
	  }
	  

	  
	  
	  
	  
	  
	  
	  
	  

}
