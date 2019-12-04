package org.cts.oneframework.testrunners;


import org.cts.oneframework.cucumber.AbstractTestNGCucumberTest;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/CucumberTest.feature", glue = {
		"org.cts.oneframework.stepdefinition" },  plugin = { "pretty" })
public class TestRunner extends AbstractTestNGCucumberTest {

	
	
}