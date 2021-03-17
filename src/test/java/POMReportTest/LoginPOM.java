package POMReportTest;


import org.base.reporttest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM extends BaseClass{
	
	public LoginPOM() {
		PageFactory.initElements(driver, this);
	}
	
//	Private Variables
	@FindBy(id="email")
	private  WebElement txtEmail;

	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(name="login")
	private WebElement btnLogin;

//	Methods
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
//	Create as reusable methods
	public void enterCred(String username, String password) {
		fill(getTxtEmail(), username);
		fill(getTxtPass(), password);
	}
	
	public void clickLgnBtn() {
		btnClick(getBtnLogin());
	}
		
}
