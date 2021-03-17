package org.test.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.test.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources", 
		glue = "org.stpdfn.reporttest",
		dryRun=false,
		plugin= {"pretty", "html:src\\test\\resources\\Reports",
							"json:src\\test\\resources\\Reports\\JN.json"})
public class TestRunner {
	
	@AfterClass
	public static void jvmReportGenaration() {
		JvmReport.genarateJvmReport(System.getProperty("user.dir")+
				"\\src\\test\\resources\\Reports\\JN.json");
	}
	

}
