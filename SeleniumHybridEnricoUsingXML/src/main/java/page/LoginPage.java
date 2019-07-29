package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	// initiate the browser
	WebDriver driver;

	public LoginPage(WebDriver driver) {// making the constructor in this page to invite the
		this.driver = driver;
	}
// creating the element to interact with the function
	@FindBy(how = How.ID, using = "username")
	WebElement Email;
	@FindBy(how = How.ID, using = "password")
	WebElement Password;
	@FindBy(how = How.NAME, using = "login")
	WebElement SignInButton;

// Creating Function
	public void loginPage(String username, String password) {
		Email.sendKeys(username);
		Password.sendKeys(password);
		SignInButton.click();

	}
}
