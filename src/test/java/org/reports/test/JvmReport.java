package org.reports.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void genarateJvmReport(String json) {
		File file = new File(System.getProperty("user.dir")+
				"\\src\\test\\resources\\Reports\\JvmReports");
		String string = file.toString();
		System.out.println("Project Path :"+string);
		Configuration config = new Configuration(file, "TestingReports");
		config.addClassifications("Platform Name : ", "Windows");
		config.addClassifications("Platform Version : ", "10 Pro");
		config.addClassifications("Browser Name : ", "Chrome");
		config.addClassifications("browser Version : ", "89.0.4389.82");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(json);
		
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, config);
		reportBuilder.generateReports();
		
		
	}
	
		
}
