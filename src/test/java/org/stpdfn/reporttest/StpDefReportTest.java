package org.stpdfn.reporttest;

import org.base.reporttest.BaseClass;
import org.junit.Assert;

import POMReportTest.LoginPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StpDefReportTest extends BaseClass{

	public LoginPOM lgnPOM;

	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {
//		launchBrowser();
		launchUrl("https://www.facebook.com/"); 
	}
	
	@When("User enter invalid {string} {string}")
	public void user_enter_invalid(String string, String string2) {
//		lgnPOM = new LoginPOM();
//		lgnPOM.enterCred(string, string2);
	}
	
	@When("User enter invalid username password")
	public void user_enter_invalid_username_password() {

		lgnPOM = new LoginPOM();
		lgnPOM.enterCred("Java", "Java@123");
	}
	@When("User click login button")
	public void user_click_login_button() throws InterruptedException {
		lgnPOM = new LoginPOM();
		lgnPOM.clickLgnBtn();
		
	}

	@Then("User should be displayed with error message")
	public void user_should_be_displayed_with_error_message() {
		String CurUrl = driver.getCurrentUrl();
		System.out.println(CurUrl);	
		Assert.assertTrue(CurUrl. contains("privacy_mutation_token"));
	}}