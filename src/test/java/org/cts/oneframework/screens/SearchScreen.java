package org.cts.oneframework.screens;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.cts.oneframework.utilities.IOSDeviceActions;
import org.cts.oneframework.utilities.Screenshots;
import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.ios.IOSDriver;

public class SearchScreen extends IOSDeviceActions {

	public SearchScreen(IOSDriver<MobileElement> driver) throws MalformedURLException {
		super(driver);
	}

	
	
	
	
	public void searchUsingFromAndToLocation(String fromLocation, String toLocation) throws InterruptedException {
		
		
		

		
		clickElement(MobileBy.id("fromIp"));
		//waitForElementToLoad(By.id("suggestInput"));
		setInputValue(MobileBy.id("suggestInput"),fromLocation);
		Screenshots.addStepWithScreenshotInReport(driver, "Entered "+fromLocation+" as Source");
		
		clickElement(MobileBy.id("selectCity"));
		//waitForElementToLoad(MobileBy.xpath("(//ul//li[@data-locationtype='CITY'])[1]"));
		clickElement(MobileBy.xpath("(//ul//li[@data-locationtype='CITY'])[1]"));
		//clickElement(driver,clickElement(By.id("")));
		
		
		//keyBoard().pressKey(AndroidKey.ENTER);
		clickElement(MobileBy.id("toIp"));
		//waitForElementToLoad(MobileBy.xpath("//*[@placeholder='Enter Area , City Name']"));
		setInputValue(MobileBy.xpath("//*[@placeholder='Enter Area , City Name']"),toLocation);
		Screenshots.addStepWithScreenshotInReport(driver, "Entered  "+toLocation+" as Destination");
		
		clickElement(MobileBy.id("selectCity"));
		//waitForElementToLoad(MobileBy.xpath("(//ul//li[@data-locationtype='CITY'])[1]"));
		clickElement(MobileBy.xpath("(//ul//li[@data-locationtype='CITY'])[1]"));
		//waitForElementToLoad(MobileBy.id("search_button"));
		clickElement(MobileBy.id("search_button"));
		Thread.sleep(5000);
		if(isElementPresent(MobileBy.xpath("//*[@id='busList']//li"))) {
			
			List <MobileElement> res=driver.findElementsByXPath("//*[@id='busList']//li");
			Screenshots.addStepWithScreenshotInReport(driver, "Clicked on Search Buses and "+res.size()+"Results are displayed");
			
		}
		else {
			Screenshots.addStepWithScreenshotInReport(driver, "Clicked on Search Buses and there are no results found please refine your search");
		}
			//Thread.sleep(5000);
			
		//}
		
		
	}
	public void selectSource(String from) {	
		try {
	driver.findElementById("fromIp").click();
		Thread.sleep(5000);
		driver.findElementById("suggestInput").sendKeys(from);
		Screenshots.addStepWithScreenshotInReport(driver, "Entered "+from+" as Source");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		//Select drpCountry = new Select(driver.findElementById("selectCity"));
		//drpCountry.selectByIndex(1);
		
		
		driver.findElementById("selectCity").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//ul//li[@data-locationtype='CITY'])[1]").click();
		Thread.sleep(5000);
		}catch(Exception e) {
		}
	}
		public void selectDestination(String to) {	
		try {
		driver.findElementById("toIp").click();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@placeholder='Enter Area , City Name']").sendKeys(to);
		
		
		//driver.findElementById("suggestInput").sendKeys("hyderabad");
		Screenshots.addStepWithScreenshotInReport(driver, "Entered  "+to+" as Destination");
		Thread.sleep(5000);
		driver.findElementById("selectCity").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//ul//li[@data-locationtype='CITY'])[1]").click();
		Thread.sleep(5000);
		}
		catch(Exception e) {
			//driver.findElementById("toIp").click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.findElementByXPath("//*[@placeholder='Enter Area , City Name']").sendKeys(to);
		}
		}
		public void searchBuses() {
		//driver.findElementById("suggestInput").sendKeys("Madiwala, Bengaluru");
			try {
				Thread.sleep(5000);
		driver.findElementById("search_button").click();
		
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Screenshots.addStepWithScreenshotInReport(driver, "Clicked on Search Buses and Results are displayed");
		//stopDriver();
	}

}
