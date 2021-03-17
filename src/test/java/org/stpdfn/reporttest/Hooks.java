package org.stpdfn.reporttest;

import java.util.Date;

import org.base.reporttest.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

	@Before
	public void beforeScenario() {

		Date date = new Date();
		System.out.println(date);
		launchBrowser();
		maxWindow();
	}
	
	@After
	public void afterScenario(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot ts=(TakesScreenshot) driver;
			byte[] scrnshotAs = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(scrnshotAs, "image/png");
			String name = s.getName();
			
			String scenarioName = name.replace(" ", "_");
			System.out.println("Scenario Failed : "+scenarioName);
		}
		
		Date date = new Date();
		System.out.println(date);
		closeBrowser();
	}
}
