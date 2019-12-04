package org.cts.oneframework.screens;

import java.net.MalformedURLException;

import org.cts.oneframework.utilities.IOSDeviceActions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;

public class HomeScreen extends IOSDeviceActions {

	public HomeScreen(IOSDriver<MobileElement> driver) throws MalformedURLException {
		super(driver);
	}

	private final String ACCEPT_TERMS_BUTTON = "//android.widget.TextView[@text='ACCEPT & CONTINUE']";
	private final String SKIP_BUTTON = "//android.widget.Button[@text='SKIP']";
	private final String GOTIT_BUTTON = "com.google.android.apps.maps:id/tutorial_side_menu_got_it";
	
	
	public void acceptTermsAndConditions() throws Exception {
		

	}
}
