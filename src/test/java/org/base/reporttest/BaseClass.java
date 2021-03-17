package org.base.reporttest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void closeBrowser() {
		driver.close();
	}
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void fill(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static void btnClick(WebElement element) {
		element.click();
	}

}
