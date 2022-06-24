package org.runner.com;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src//test//resources//Features"},
				glue = {"org.testcase.com"},
				plugin = {"pretty","html:target/HtmlReports.html","json:target/JsonReports/JsonReport.json","junit:target/JunitReports/JunitReport"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
