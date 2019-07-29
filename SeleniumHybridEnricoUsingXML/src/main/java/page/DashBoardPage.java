package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage {
	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[text()='CRM']")
	WebElement CRM;
	@FindBy(how = How.XPATH, using = "//a[text()='Add Contact']")
	WebElement AddContact;

	public void goToAddContact() {
		CRM.click();
		AddContact.click();

	}

}
