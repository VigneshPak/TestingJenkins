$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefiles/LoginRptTest.feature");
formatter.feature({
  "name": "To validate the login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StpDefReportTest.user_is_in_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login using invalid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enter invalid username password",
  "keyword": "When "
});
formatter.match({
  "location": "StpDefReportTest.user_enter_invalid_username_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StpDefReportTest.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be displayed with error message",
  "keyword": "Then "
});
formatter.match({
  "location": "StpDefReportTest.user_should_be_displayed_with_error_message()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stpdfn.reporttest.StpDefReportTest.user_should_be_displayed_with_error_message(StpDefReportTest.java:43)\r\n\tat ✽.User should be displayed with error message(file:src/test/resources/Featurefiles/LoginRptTest.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});