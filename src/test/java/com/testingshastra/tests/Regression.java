package com.testingshastra.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.keywords.Constants;
import com.testingshastra.keywords.Keyword;
import com.testingshastra.utilities.Utils;

public class Regression {
	/*
	 * This test case is use to verify URL of Amazon.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_01() {
		Keyword.openBrowser("Chrome");
		Keyword.maximizeBrowser();
		Keyword.openUrl("https://Amazon.in");
		System.out.println();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException Occurs");
			e.printStackTrace();
		}
		Keyword.closeBrowser();
			
	}
	
	/*
	 * This test case is use to verify Customer Service page.
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
	 * This test case is use to verify Customer Service page.
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
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Customer Service page title.
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
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Customer Service page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_05() {
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
		Keyword.clickOnElement(Utils.getLocator("ManageAddresses")[0], Utils.getLocator("ManageAddresses")[1]);
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Customer Service page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_06() {
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
		Keyword.clickOnElement(Utils.getLocator("ManagePrime")[0], Utils.getLocator("ManagePrime")[1]);
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Customer Service page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_07() {
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
		Keyword.clickOnElement(Utils.getLocator("PaymentSettings")[0], Utils.getLocator("PaymentSettings")[1]);
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Customer Service page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_08() {
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
		Keyword.clickOnElement(Utils.getLocator("AccountSettings")[0], Utils.getLocator("AccountSettings")[1]);
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Customer Service page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_09() {
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
		Keyword.clickOnElement(Utils.getLocator("COVID19Amazon")[0], Utils.getLocator("COVID19Amazon")[1]);
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Customer Service page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_10() {
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
		Keyword.clickOnElement(Utils.getLocator("Search")[0], Utils.getLocator("Search")[1]);
		Keyword.closeBrowser();
	}
	
	/*
	 * This test case is use to verify Customer Service page title.
	 * @author Nishant Choudhari
	 */
	@Test
	public void tc_11() {
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
		JavascriptExecutor js=(JavascriptExecutor)Constants.driver;
		js.executeScript("window.scrollBy(0,500)");
		Keyword.clickOnElement(Utils.getLocator("Go")[0], Utils.getLocator("Go")[1]);
		Keyword.closeBrowser();
	}
	
		
}
