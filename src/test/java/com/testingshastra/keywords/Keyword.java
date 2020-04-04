/*
 * Project Name: Automation Keyword Framework
 * Author: Nishant Choudhari for Testing Shastra
 * Organization: Testing Shastra
 */
package com.testingshastra.keywords;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Keyword {
	
	public static void openBrowser(String browserName) {
		switch(browserName) {
		case "Chrome":
			System.out.println("Opening Chrome Browser.....");
			WebDriverManager.chromedriver().setup();
			Constants.driver= new ChromeDriver();
			break;
		case "IE":
			System.out.println("Opening IE Browser.....");
			WebDriverManager.iedriver().setup();
			Constants.driver=new InternetExplorerDriver();
			break;
		case "Firefox":
			System.out.println("Opening Firefox Browser.....");
			WebDriverManager.firefoxdriver().setup();
			Constants.driver=new FirefoxDriver();
			break;
		case "Safari":
			System.out.println("Opening Safari Browser.....");
			Constants.driver=new SafariDriver();
			break;
		/*case "HTML":
			System.out.println("Opening HTML Browser.....");
			Constants.driver=new HtmlUnitDriver();
			break;
			*/
		
		default:
			System.err.println("Invalid Browser Name: "+browserName);
		}
		
}
	public static void openUrl(String url) {
		System.out.println(url+" is Loading.....");
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
		Constants.select=new Select(element);
		Constants.select.selectByVisibleText(textToSelect);
		System.out.println("Value from Dropdown Selected. ");
		
	}
	
	public static void moveToElement(String locatorType, String locatorValue) {
		Constants.action= new Actions(Constants.driver);
		Constants.action.moveToElement(getWebElement(locatorType,locatorValue));
		Constants.action.perform();
			
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
	
	/*
	 *This method is used to handle the alert 
	 */
	public static boolean isAlertPresent() {
		
		try {
			Constants.driver.switchTo().alert().accept();
			return true;
			
		} catch (Exception e) {
			System.out.println("Exception occurs");
			return false;
			
		}
		
	}
		
	/*
	 * This method is used to apply implicit wait
	 */
	public static void applyImplicitWait() {
		Constants.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	/*
	 * This method is used to apply Thread.sleep
	 */
	public static void applyThreadSleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("InteruptedException occurs");
			e.printStackTrace();
		}
	}
	
	/*
	 * This method is used to handle the windows
	 */
	public static void windowHandle() {
		String parentwindow=Constants.driver.getWindowHandle();
		Set<String> allkeys=Constants.driver.getWindowHandles();
		for(String child: allkeys) {
			while(!parentwindow.equals(child)) {
				Constants.driver.switchTo().window(child);
			}
		}
		
	}
	
	/*
	 * This method is used to take screenshot of the event occurred.
	 */
	public static void takeScreenshot(String screenshotPath,String fileName ,String extension ) {
		TakesScreenshot ts = (TakesScreenshot) Constants.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd_hh_mm_ss").format(new java.util.Date());
		try {
			FileUtils.copyFile(src, new File(screenshotPath+fileName+" "+dateTimeFormat+extension));
			System.out.println("Taken Screenshot");
		} catch (IOException e) {
			System.out.println("IOException occures");
			e.printStackTrace();
		}
	}
	
	/*
	 * This method is used to take full page screenshot of the event occurred.
	 */
	/*public static void takeFullScreenshot(String screenshotPath,String fileName ,String extension ) {
		AShot ashot=new AShot();
		//TakesScreenshot ts = (TakesScreenshot) Constants.driver;
		
		//File src = ts.getScreenshotAs(OutputType.FILE);
		String dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd_hh_mm_ss").format(new java.util.Date());
		try {
			FileUtils.copyFile(src, new File(screenshotPath+fileName+" "+dateTimeFormat+extension));
			System.out.println("Taken Full Page Screenshot");
		} catch (IOException e) {
			System.out.println("IOException occures");
			e.printStackTrace();
		}
	}*/
	
}


