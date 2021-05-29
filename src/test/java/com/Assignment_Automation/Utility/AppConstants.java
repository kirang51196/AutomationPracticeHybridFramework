package com.Assignment_Automation.Utility;

import java.util.ArrayList;

/**
 * @author Sarang Holey
 *	This class having all the constant values
 *	which needed for validation throughout the project
 *	Ex. Page Titles
 */
public class AppConstants {
	
	
	public static final int WEBDRIVER_WAIT_TIMEOUT = 20;
	public static final String LANDING_PAGE_REDIRECTED_URL = "http://automationpractice.com/index.php";
	public static final String LANDING_PAGE_TITLE = "My Store";
     
	public static final String News_Subsription_Email="monu12348@gmail.com";

	
	public static ArrayList<String> landingPageProdCategoryExpected()
	{
		ArrayList<String> LANDING_PAGE_PROD_CATEGORY_EXPECTED = new ArrayList<>();
		LANDING_PAGE_PROD_CATEGORY_EXPECTED.add("WOMEN");
		LANDING_PAGE_PROD_CATEGORY_EXPECTED.add("DRESSES");
		LANDING_PAGE_PROD_CATEGORY_EXPECTED.add("T-SHIRTS");
		
		return LANDING_PAGE_PROD_CATEGORY_EXPECTED;
	}
	
	public static final  String SIGNIN_PAGE_TITLE = "Login - My Store";
	public static final String NewsSubscriptionSuccessMsg = "Newsletter : You have successfully subscribed to this newsletter.";
    
	public static final String EmailID = "kirang51106@gmail.com";
    public static final String Password ="Ywi26Us5Qcc@UMW";
		
    public static final String TITLEOFREVIEW = "Faded short sleeves T-shirt";
	public static final String COMMENT = "Product quality is good but color slightly vary as shown in picture";
	

}

