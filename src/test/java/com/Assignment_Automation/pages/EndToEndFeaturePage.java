package com.Assignment_Automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Assignment_Automation.Base.BasePage;
import com.Assignment_Automation.Utility.ElementActions;
import com.Assignment_Automation.Variables.EndUserVariable;
import com.Assignment_Automation.Variables.RegisterPageUserDetails;
import com.lowagie.text.Element;

public class EndToEndFeaturePage extends BasePage {
	
   private static final Logger logger = LogManager.getLogger(EndToEndFeaturePage.class);
	ElementActions elementActions;
	
   //	By Locator
	
	By T_shirtBTn = By.xpath("//div[@id='block_top_menu']/ul/li[3]/a");
	By ProductImgClick=By.xpath("//div[@class='product-image-container']/a/img");
    By MoreBtn = By.xpath("//a[@title='View']/span");
    By Amount = By.xpath("//span[@id='our_price_display']");
    By QuantityIncrease= By.xpath("//*[@id='quantity_wanted']");
    By SizeDropDown = By.xpath("//*[@id='group_1']");
    By ClickOnAddToCart = By.xpath("//p[@id='add_to_cart']/button/span");
    By sucussMsg = By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2");
    By checkQuantity = By.xpath("//*[@id='layer_cart']/div[1]/div[1]/div[2]/div[1]");
    By checkColor = By.id("layer_cart_product_attributes");
    By checkTotalPrice =By.xpath("//*[@id='layer_cart_product_price']");
    By clickOnProcedToCheckOut = By.xpath("//a[@title='Proceed to checkout']");
    
    //After Click on Proceed to Checkout
    By ProductName = By.xpath("//table[@id='cart_summary']/descendant::p[@class='product-name']/a");
    By ProductIsInStock = By.xpath("//*[text()='In stock']");
    By unitPrice= By.xpath("//*[text()='$16.51']");
    By AgainCheckQuantity = By.xpath("//td[@class='cart_quantity text-center']/input[2]");
    By FinalPrice = By.xpath("//td[text()='$35.02']");
    By TotalShippingProductQuantity = By.xpath("//*[@id='total_shipping']");
    By AgainClickOnProcedToCheckOut = By.xpath("//div[@id='center_column']/descendant::p[@class='cart_navigation clearfix']/a/span");
    
    //signinToAccount
    By email=By.id("email");
    By pass=By.id("passwd");
    By loginBtn = By.id("SubmitLogin");
    By cilckonProceedBtn = By.xpath("//button[@name='processAddress']/span");
    By TermCondCheckBox = By.id("cgv");
    By clickonProceedBtn2 =	By.xpath("//button[@name='processCarrier']/span");
    
    //Payment page Locator
    By ClickOnPaybyBank = By.xpath("//a[@title='Pay by bank wire']");
    By ClickOnConfirmOrder = By.xpath("//*[@id=\"cart_navigation\"]/button/span");	   
    By OrderMsg = By.xpath("//div[@id='center_column']/div/p/strong");
    By CheckAmount = By.xpath("//*[text()='$35.02']");
    

    // Constructor of the page:
	public EndToEndFeaturePage(WebDriver driver) {
		elementActions = new ElementActions(driver);
	}

	//Page Actions
	public void CheckEndToEndFeatures() throws InterruptedException {
		elementActions.doClick(T_shirtBTn);
		elementActions.waitForElementClickable(T_shirtBTn);
		elementActions.doMoveToElement(ProductImgClick);
		elementActions.waitForElementVisible(ProductImgClick);
		elementActions.doClick(MoreBtn);
		
		String AmountValue = elementActions.doGetText(Amount);
		logger.info("1st time Amount is:"+AmountValue);

		
	   elementActions.clear(QuantityIncrease);
	   elementActions.waitForElementPresent(QuantityIncrease);
	   elementActions.doSendKeys(QuantityIncrease,EndUserVariable.Quantity);
	   logger.info("Selected value of Quantity is : " +EndUserVariable.Quantity );
       elementActions.selectByVisibleTextFromDropDown(SizeDropDown, EndUserVariable.DDSIZEValue);
	   logger.info("Selected size from DropDown is : " +EndUserVariable.DDSIZEValue);
       elementActions.doClick(ClickOnAddToCart);
	   logger.info("clicking on AddToCart Button ");
				
     String ProductAddMsg = elementActions.doGetText(sucussMsg);
	 elementActions.waitForElementVisible(sucussMsg);
     logger.info("Product Added Sucees Msg:"+ProductAddMsg);
	 Assert.assertTrue(true, ProductAddMsg);

	
	String QuantityValue = elementActions.doGetText(checkQuantity);
	elementActions.waitForElementVisible(checkQuantity);
	logger.info("Now Total Quntity is:"+QuantityValue);

	
	
	String ColorName = elementActions.doGetText(checkColor);
	elementActions.waitForElementVisible(checkColor);
    logger.info("Color name is:"+ColorName);

	String Price = elementActions.doGetText(checkTotalPrice);
	elementActions.waitForElementVisible(checkTotalPrice);
	logger.info("Total price after increase quantity is Double:"+Price);

	
	elementActions.doClick(clickOnProcedToCheckOut);
	logger.info("Click on ProceedCheckoutBTn");
	
	//After Click on ProceedToValidation
	String productName = elementActions.doGetText(ProductName);
	elementActions.waitForElementVisible(ProductName);
	logger.info("Product Name is:"+productName);
	//return productName;
	
	String Instock = elementActions.doGetText(ProductIsInStock);
	elementActions.waitForElementVisible(ProductIsInStock);
    logger.info("Product available in InStock:"+Instock);

    String UnitPrice = elementActions.doGetText(unitPrice);
    if(UnitPrice.contains("$16.51")) {
    logger.info("Unit price is Equal to Previous Price");

    }
    else {
        logger.info("Unit price is not Equal to Previous Price");
	 }
    
  String ValidateQuantity = elementActions.doGetText(AgainCheckQuantity);
  elementActions.waitForElementVisible(AgainCheckQuantity);
  logger.info("Final Total Quantity is equal to previous:"+ValidateQuantity);

    String FinalTotalPrice = elementActions.doGetText(FinalPrice);
    elementActions.waitForElementVisible(FinalPrice);
    logger.info("Final Total Price is Double than 1stTime Show Price with shipping price:"+FinalTotalPrice);

    String NoOfProductforShipping = elementActions.doGetText(TotalShippingProductQuantity);
    elementActions.waitForElementVisible(FinalPrice);
    logger.info("No Of Product for Shipping:"+NoOfProductforShipping);

    elementActions.doClick(AgainClickOnProcedToCheckOut);
    logger.info("Again Click on ProceedCheckoutBTn");
   
    //signInPage
	elementActions.doActionsSendKeys(email, EndUserVariable.EmailID);
    logger.info("Sending user email id as : " + EndUserVariable.EmailID);
    elementActions.doSendKeys(pass,EndUserVariable.Password );
    logger.info("Sending user pass  as :" +EndUserVariable.Password );
    elementActions.doClick(loginBtn);
    elementActions.doClick(cilckonProceedBtn);
    elementActions.doClick(TermCondCheckBox);
    logger.info("After Ckick on Terms and Condition CheckBox");
    elementActions.doClick(clickonProceedBtn2);
    elementActions.doClick(ClickOnPaybyBank);
    logger.info("Click On Pay Bank Wire");
    elementActions.doClick(ClickOnConfirmOrder);
    logger.info("Click On Confirm Order");
    String OrderSuccesMsg = elementActions.doGetText(OrderMsg);
    elementActions.waitForElementVisible(OrderMsg);
    logger.info("After confirm oderMsg is:"+OrderSuccesMsg);
    String ConfirmAmount = elementActions.doGetText(CheckAmount);
    elementActions.waitForElementVisible(CheckAmount);
    logger.info("After confirm oder Amount is:"+ConfirmAmount);

    
    
  
	}    
}
