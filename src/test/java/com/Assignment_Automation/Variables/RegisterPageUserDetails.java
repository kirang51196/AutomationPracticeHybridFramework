package com.Assignment_Automation.Variables;

import com.Assignment_Automation.Utility.RandomNumberGeneratorUtil;

public class RegisterPageUserDetails {
	
	public RandomNumberGeneratorUtil randomUtil;
	
	public RegisterPageUserDetails() {
		randomUtil = new RandomNumberGeneratorUtil();
	}

	// Setter for Variable - SignIn Page
	public String getUserNewEmailId()
	{
		String newUserEmailId = "DemoUser345"+randomUtil.randomStringGenerator()+"@gmail.com";
		return newUserEmailId;
	}
	//public static String NewUserEmailID = "DemoUser111"+randomUtil.randomStringGenerator()+"@gmail.com";
	
	// Setter for Variable - Register User Details FirstName
	public String getUserFirstName()
	{
		String userFirstName = randomUtil.randomStringGenerator();
		return userFirstName;
	}
	//public static String userFirstName = randomUtil.randomStringGenerator();
	
	
	// Setter for Variable - Register User Details LastName
	public String getUserLastName()
	{
		String userLastName = randomUtil.randomStringGenerator();
		return userLastName;
	}
	//public static String userLastName = randomUtil.randomStringGenerator();
	
	// Variables - Register User Details
	public static final String userPassword = "123@Abc";
	public static final String DOBDayValue = "5";
	public static final String DOBMonthValue = "11";
	public static final String DOBYearValue = "2010";
	public static final boolean IsSignUpForNewsLetter = true;
	public static final boolean IsspecialOfferEmailRec = true;
	public static final String AddressComanyName = "Digital Marketing";
	public static final String AddressLine1Name = "2278  New Street, PO Box 23";
	public static final String AddressLine2Name = "Navjeevan Garden";
	public static final String AddressCity = "New Angel";
	public static final String AddressState = "Hawaii";
	public static final String AddressZipCode = "10005";
	public static final String AddressAdditionalInfo = "Please Send do the proceedings ASAP";
	public static final String AddressHomePhone = "56457825";
	public static final String AddressMobilePhone = "+16465567479";
	public static final String AdddressAliasAddress = "userDemo@gmail.com";

}
