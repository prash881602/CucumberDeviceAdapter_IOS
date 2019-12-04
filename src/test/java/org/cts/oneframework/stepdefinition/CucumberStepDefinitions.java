package org.cts.oneframework.stepdefinition;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.cts.oneframework.screens.HomeScreen;
import org.cts.oneframework.screens.MapSearchResultsScreen;
import org.cts.oneframework.screens.SearchScreen;
import org.cts.oneframework.utilities.BaseTest;
import org.cts.oneframework.utilities.Screenshots;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;

public class CucumberStepDefinitions extends BaseTest {

	private static IOSDriver<MobileElement> driver;
	private HomeScreen homeScreen;
	private SearchScreen searchScreen;
	private MapSearchResultsScreen mapSearchResultsScreen;

	public CucumberStepDefinitions() {
		super();
	}

	@When("App is launched")
	public void app_is_launched() {
		try {
			driver = launchApp();
			driver.get("https://www.redbus.in/");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.get("https://www.redbus.in/");
		}
	}

	@Then("Book a bus ticket from {string} to {string}")
	public void book_a_bus_ticket_from_to(String from, String to) throws Exception {
		String fromLocation = DefaultStepDefinition.currentIterationMap.get(from);
		String toLocation = DefaultStepDefinition.currentIterationMap.get(to);
		//driver.get("https://www.redbus.in/");
		searchScreen = new SearchScreen(driver);
		searchScreen.searchUsingFromAndToLocation(fromLocation, toLocation);
		
		//searchScreen.selectSource(fromLocation);
		//searchScreen.selectDestination(toLocation);
		//searchScreen.searchBuses();
	}

	@Then("Close the App")
	public void close_the_App() {
		//closeApp(driver);
	}
	
	}



