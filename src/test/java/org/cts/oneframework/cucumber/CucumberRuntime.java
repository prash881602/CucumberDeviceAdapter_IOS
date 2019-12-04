package org.cts.oneframework.cucumber;

import org.openqa.selenium.remote.RemoteWebDriver;

public class CucumberRuntime {

	private RemoteWebDriver driver;

	public CucumberRuntime() {

	}

	public CucumberRuntime(RemoteWebDriver driver) {
		//
		this.driver = driver;
	}

	private static ThreadLocal<CucumberRuntime> instances = new ThreadLocal<CucumberRuntime>();

	public static synchronized CucumberRuntime get() {
		return instances.get();
	}

	public void setDriver(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public RemoteWebDriver getDriver() {
		return driver;
	}

	public static synchronized void set(RemoteWebDriver driver) {

		instances.set(new CucumberRuntime(driver));

	}

}
