package org.cts.oneframework.screens;

import java.net.MalformedURLException;
import java.util.List;

import org.cts.oneframework.utilities.IOSDeviceActions;
import org.cts.oneframework.utilities.Screenshots;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;

public class MapSearchResultsScreen extends IOSDeviceActions {

	public MapSearchResultsScreen(IOSDriver<MobileElement> driver) throws MalformedURLException {
		super(driver);
	}

	private final String TEXTS = "//*[@class='android.widget.TextView']";
	private final String MIN = "min";
	private final String KM = "km";
	

	public void findDistanceAndTime(String fromLocation, String toLocation) {
		
		

	}
}
