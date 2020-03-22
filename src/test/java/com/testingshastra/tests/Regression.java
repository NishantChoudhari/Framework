package com.testingshastra.tests;

import org.testng.annotations.Test;

import com.testingshastra.keywords.Constants;
import com.testingshastra.keywords.Keyword;

public class Regression {
	@Test
	public void tc_01() {
		Keyword.openBrowser("Chrome");
	    Constants.driver.manage().window().maximize();
		Keyword.openUrl("https://Amazon.in");
		//Keyword.enterText(locatorType, locatorValue, textToEnter);
		//Keyword.enterText(locatorType, locatorValue, textToEnter);
		//Keyword.clickOnElement(locatorType, locatorValue);
		//Keyword.selectValueFromDropdown(locatorType, locatorValue, textToSelect);
		//Keyword.selectValueFromDropdown(locatorType, locatorValue, textToSelect);
		//Keyword.selectValueFromDropdown(locatorType, locatorValue, textToSelect);
			
	}

}
