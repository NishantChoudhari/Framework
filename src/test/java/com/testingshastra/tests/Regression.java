package com.testingshastra.tests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.keywords.Constants;
import com.testingshastra.keywords.Keyword;
import com.testingshastra.utilities.Utils;

public class Regression {
	
	//Constants.logger =LogManager.getLogger(Regression.class);
	
	/*
	 * This test case is use to verify URL of Amazon.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_01() {
		Constants.logger =LogManager.getLogger(Regression.class);
		Keyword.openBrowser("Chrome");
		Constants.logger.info("Chrome Browser Opened Successfully");
		Constants.logger.error("No error while opening Chrome Browser");
		Keyword.maximizeBrowser();
		Constants.logger.info("Browser maximized Successfully");
		Constants.logger.warn("Warning, the Browser is Maximized");
		Keyword.openUrl("https://Amazon.in");
		Constants.logger.info("URL Launched Successfully");
		Keyword.applyThreadSleep();
		Keyword.takeScreenshot("ScreenShots/", "URL", ".png");
		Constants.logger.info("Screenshot has been taken Successfully");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException Occurs");
			e.printStackTrace();
		}
		Assert.assertEquals(Constants.driver.getCurrentUrl(), "https://www.amazon.in/");
		Keyword.closeBrowser();
		Constants.logger.info("Browser Successfully Closed");
			
	}
	
	
	/*
	 * This test case is use to verify Customer Service page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_02() {
		Keyword.openBrowser("Chrome");
	    Keyword.maximizeBrowser();
		Keyword.openUrl("https://Amazon.in");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("InteruptedException Occurs");
			e.printStackTrace();
		}
		Keyword.clickOnElement(Utils.getLocator("CustomerService")[0], Utils.getLocator("CustomerService")[1]);
		System.out.println(Constants.driver.getTitle());
		Assert.assertEquals(Constants.driver.getTitle(), "Amazon.in Help: Help");
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Your Orders page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_03() {
		Keyword.openBrowser("Chrome");
	    Keyword.maximizeBrowser();
		Keyword.openUrl("https://Amazon.in");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("InteruptedException Occurs");
			e.printStackTrace();
		}
		Keyword.clickOnElement(Utils.getLocator("CustomerService")[0], Utils.getLocator("CustomerService")[1]);
		Keyword.clickOnElement(Utils.getLocator("YourOrders")[0], Utils.getLocator("YourOrders")[1]);
		System.out.println(Constants.driver.getTitle());
		Assert.assertEquals(Constants.driver.getTitle(), "Amazon Sign In");
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Returns & Refunds page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_04() {
		Keyword.openBrowser("Chrome");
	    Keyword.maximizeBrowser();
		Keyword.openUrl("https://Amazon.in");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("InteruptedException Occurs");
			e.printStackTrace();
		}
		Keyword.clickOnElement(Utils.getLocator("CustomerService")[0], Utils.getLocator("CustomerService")[1]);
		Keyword.clickOnElement(Utils.getLocator("ReturnsRefunds")[0], Utils.getLocator("ReturnsRefunds")[1]);
		System.out.println(Constants.driver.getTitle());
		Assert.assertEquals(Constants.driver.getTitle(), "Amazon Sign In");
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Manage Addresses page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_05() {
		Keyword.openBrowser("Chrome");
	    Keyword.maximizeBrowser();
		Keyword.openUrl("https://Amazon.in");
		Keyword.applyThreadSleep();
		Keyword.clickOnElement(Utils.getLocator("CustomerService")[0], Utils.getLocator("CustomerService")[1]);
		Keyword.clickOnElement(Utils.getLocator("ManageAddresses")[0], Utils.getLocator("ManageAddresses")[1]);
		System.out.println(Constants.driver.getTitle());
		Assert.assertEquals(Constants.driver.getTitle(), "Amazon Sign In");
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Manage Prime page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_06() {
		Keyword.openBrowser("Chrome");
	    Keyword.maximizeBrowser();
		Keyword.openUrl("https://Amazon.in");
		Keyword.applyThreadSleep();
		Keyword.clickOnElement(Utils.getLocator("CustomerService")[0], Utils.getLocator("CustomerService")[1]);
		Keyword.clickOnElement(Utils.getLocator("ManagePrime")[0], Utils.getLocator("ManagePrime")[1]);
		System.out.println(Constants.driver.getTitle());
		Assert.assertEquals(Constants.driver.getTitle(), "Amazon Sign In");
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Payment Settings page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_07() {
		Keyword.openBrowser("Chrome");
	    Keyword.maximizeBrowser();
		Keyword.openUrl("https://Amazon.in");
		Keyword.applyThreadSleep();
		Keyword.clickOnElement(Utils.getLocator("CustomerService")[0], Utils.getLocator("CustomerService")[1]);
		Keyword.clickOnElement(Utils.getLocator("PaymentSettings")[0], Utils.getLocator("PaymentSettings")[1]);
		System.out.println(Constants.driver.getTitle());
		Assert.assertEquals(Constants.driver.getTitle(), "Amazon Sign In");
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Account Settings page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_08() {
		Keyword.openBrowser("Chrome");
	    Keyword.maximizeBrowser();
		Keyword.openUrl("https://Amazon.in");
		Keyword.applyThreadSleep();
		Keyword.clickOnElement(Utils.getLocator("CustomerService")[0], Utils.getLocator("CustomerService")[1]);
		Keyword.clickOnElement(Utils.getLocator("AccountSettings")[0], Utils.getLocator("AccountSettings")[1]);
		System.out.println(Constants.driver.getTitle());
		Assert.assertEquals(Constants.driver.getTitle(), "Amazon Sign In");
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify COVID19 Amazon page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_09() {
		Keyword.openBrowser("Chrome");
	    Keyword.maximizeBrowser();
		Keyword.openUrl("https://Amazon.in");
		Keyword.applyThreadSleep();
		Keyword.clickOnElement(Utils.getLocator("CustomerService")[0], Utils.getLocator("CustomerService")[1]);
		Keyword.clickOnElement(Utils.getLocator("COVID19Amazon")[0], Utils.getLocator("COVID19Amazon")[1]);
		System.out.println(Constants.driver.getTitle());
		Assert.assertEquals(Constants.driver.getTitle(), "Amazon.in Help: COVID-19 FAQ");
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Search Box.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_10() {
		Keyword.openBrowser("Chrome");
	    Keyword.maximizeBrowser();
		Keyword.openUrl("https://Amazon.in");
		Keyword.applyThreadSleep();
		Keyword.clickOnElement(Utils.getLocator("CustomerService")[0], Utils.getLocator("CustomerService")[1]);
		Keyword.clickOnElement(Utils.getLocator("Search")[0], Utils.getLocator("Search")[1]);
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Go button.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_11() {
		Keyword.openBrowser("Chrome");
	    Keyword.maximizeBrowser();
		Keyword.openUrl("https://Amazon.in");
		Keyword.applyThreadSleep();
		Keyword.clickOnElement(Utils.getLocator("CustomerService")[0], Utils.getLocator("CustomerService")[1]);
		Constants.jse=(JavascriptExecutor)Constants.driver;
		Constants.jse.executeScript("window.scrollBy(0,500)");
		Keyword.clickOnElement(Utils.getLocator("Go")[0], Utils.getLocator("Go")[1]);
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Browse Help Topics.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_12() throws FileNotFoundException, IOException, ParseException {
		Keyword.openBrowser("Chrome");
	    Keyword.maximizeBrowser();
		Keyword.openUrl("https://Amazon.in");
		Keyword.applyThreadSleep();
		Keyword.clickOnElement(Utils.getLocator("CustomerService")[0], Utils.getLocator("CustomerService")[1]);
		
		Constants.jse=(JavascriptExecutor)Constants.driver;
		Constants.jse.executeScript("window.scrollBy(0,800)");
		
		JSONParser parser=new JSONParser();
		Object unitObj=parser.parse(new FileReader("C:\\Users\\Nishant Choudhari\\eclipse-workspace\\keywordFramework\\src\\test\\resources\\ExpectedHelpTopics.jason"));
		JSONObject unitJson=(JSONObject)unitObj;
		JSONArray units=(JSONArray) unitJson.get("Recommended Topics");
		System.out.println(units);
		
		for (int i = 0; i < units.size(); i++) {
			System.out.println(units.get(i));
		}
		
		
		//Keyword.clickOnElement(Utils.getLocator("Go")[0], Utils.getLocator("Go")[1]);
		Keyword.closeBrowser();
	}

	/*
	 * This method is used to click on Your Transactions
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void tc_013() {
		Keyword.openBrowser("Chrome");
	    Keyword.maximizeBrowser();
		Keyword.openUrl("https://Amazon.in");
		Keyword.applyThreadSleep();
		Set<String> set=Constants.driver.getWindowHandles();
		ArrayList<String> arrlist=new ArrayList<String>(set);
		Constants.driver.switchTo().window(arrlist.get(0));
		System.out.println(set);
		Keyword.applyImplicitWait();
		String actual=
	}
}
