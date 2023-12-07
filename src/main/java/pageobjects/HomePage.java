package pageobjects;

import org.openqa.selenium.support.FindBy;
import utilities.Utilities;

import org.openqa.selenium.*;

public class HomePage extends Utilities{

	

	@FindBy(id = "user-name")
	private WebElement UserName;

	@FindBy(id = "password")
	private WebElement PassWord;

	@FindBy(id = "login-button")
	private WebElement LoginButton;

	// By UN = By.xpath("");
	// WebElement ele = driver.findElement(UN);

	public void enterUN(String UN) throws InterruptedException {
		flashing(LoginButton);
		sendKeys(UserName,UN);
	}

	public void enterPW(String PW) throws InterruptedException {
		flashing(LoginButton);
		sendKeys(PassWord,PW);
	}

	public void clickLoginBtn() throws InterruptedException {
		flashing(LoginButton);
		clickOnElement(LoginButton);
	}
}
