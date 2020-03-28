/*
 * Project Name: Automation Keyword Framework
 * Author: Nishant Choudhari for Testing Shastra
 * Organization: Testing Shastra
 */
package com.testingshastra.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {
	
	public static void openBrowser(String browserName) {
		switch(browserName) {
		case "Chrome":
			System.out.println("Opening Chrome Browser");
			WebDriverManager.chromedriver().setup();
			Constants.driver= new ChromeDriver();
			break;
		case "IE":
			System.out.println("Opening IE Browser");
			WebDriverManager.iedriver().setup();
			Constants.driver=new InternetExplorerDriver();
			break;
		case "Firefox":
			System.out.println("Opening Firefox Browser");
			WebDriverManager.firefoxdriver().setup();
			Constants.driver=new FirefoxDriver();
			break;
		case "Safari":
			System.out.println("Opening Safari Browser");
			Constants.driver=new SafariDriver();
			break;
		/*case "HTML":
			System.out.println("Opening HTML Browser");
			Constants.driver=new HtmlUnitDriver();
			break;
			*/
		default:
			System.err.println("Invalid Browser Name: "+browserName);
		}
		
}
	public static void openUrl(String url) {
		System.out.println(url+" is Loading..");
		Constants.driver.get(url);
	}
	
	private static WebElement getWebElement(String locatorType, String locatorValue) {
		WebElement element=null;
		switch(locatorType) {
		case "XPATH":
			element=Constants.driver.findElement(By.xpath(locatorValue));
			break;
		case "CSS":
			element=Constants.driver.findElement(By.cssSelector(locatorValue));
			break;
		case "ID":
			element=Constants.driver.findElement(By.id(locatorValue));
			break;
		case "LINK_TEXT":
			element=Constants.driver.findElement(By.linkText(locatorValue));
			break;
		case "PARTIAL_LINK_TEXT":
			element=Constants.driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "CLASS_NAME":
			element=Constants.driver.findElement(By.className(locatorValue));
			break;
		default:
			System.err.println("Invalid Locator Type: "+locatorType+". Expected: XPATH CSS ID LINK_TEXT PARTIAL_LINK_TEXT CLASS_NAME");
			break;
		}
		return element;
	}
	
	public static void enterText(String locatorType,String locatorValue, String textToEnter) {
		
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);
		System.out.println("Text Entered. ");
		
	}

	public static void clickOnElement(String locatorType, String locatorValue) {
		
		getWebElement(locatorType, locatorValue).click();
		System.out.println("Clicked on Element. ");
		
	}
	
	public static void selectValueFromDropdown(String locatorType,String locatorValue, String textToSelect) {
		WebElement element=getWebElement(locatorType, locatorValue);
		Select select=new Select(element);
		select.selectByVisibleText(textToSelect);
		System.out.println("Value from Dropdown Selected. ");
		
	}
	
	/*
	 * This method is used for maximizing the browser window.
	 * @Author Nishant Choudhari                                                                                                                                                                                                                                                                                                                                                       
	 */
	public static void maximizeBrowser() {
		Constants.driver.manage().window().maximize();                                                                                                                                                                                                                                                                                                                                                                                                       
	}
	
	/*
	 * This method is used to close the current browser.
	 * @Author Nishant Choudhari
	 */
	public static void closeBrowser() {
		Constants.driver.close();
	}
	
	/*
	 * This method is used to quit the Browser.
	 * @Author Nishant Choudhari
	 */
	public static void closeAllBrowsers() {
		Constants.driver.quit();

	}
}
