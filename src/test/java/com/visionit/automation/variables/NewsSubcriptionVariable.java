package com.visionit.automation.variables;

import com.visionit.automation.utils.RandomNumberGeneratorUtil;

public class NewsSubcriptionVariable {
	

	public RandomNumberGeneratorUtil randomUtil;
	
	public NewsSubcriptionVariable() {
		randomUtil = new RandomNumberGeneratorUtil();
	}


	// Setter for Variable - SignIn Page
		public String getUserNewEmailId()
		{
			String newUserEmailId = "User234"+randomUtil.randomStringGenerator()+"@gmail.com";
			return newUserEmailId;
		}
		
		
		public static final String NewsSubscriptionSuccessMsg = " Newsletter : You have successfully subscribed to this newsletter.";

}


