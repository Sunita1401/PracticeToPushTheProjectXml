package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage {

	WebDriver driver;

	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "account")
	WebElement FullName;
	@FindBy(how = How.ID, using = "company")
	WebElement Company;
	@FindBy(how = How.ID, using = "email")
	WebElement Email;
	@FindBy(how = How.ID, using = "phone")
	WebElement PhoneNumber;
	@FindBy(how = How.ID, using = "address")
	WebElement Address;
	@FindBy(how = How.ID, using = "city")
	WebElement City;
	@FindBy(how = How.ID, using = "state")
	WebElement State;
	@FindBy(how = How.ID, using = "zip")
	WebElement Zip;
	@FindBy(how = How.ID, using = "submit")
	WebElement Submit;

	public void fillTheForm (String name1, String company1, String email1, String phone1, String address1,
			String city1, String state1, String zip1) {

		FullName.sendKeys(name1);
		Company.sendKeys(company1);
		Email.sendKeys(email1);
		PhoneNumber.sendKeys(phone1);
		Address.sendKeys(address1);
		City.sendKeys(city1);
		State.sendKeys(state1);
		Zip.sendKeys(zip1);
		Submit.click();

	}
}
