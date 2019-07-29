package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {

	@Test
	@Parameters({"email","password","Name","Company","Email","Phone","Address","City","State","Zip"})
	public void addContactTest(String email,String password,String Name,String Company,String Email,String Phone,String Address,String City,String State, String Zip) {
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.loginPage(email, password);

		DashBoardPage dashboardpage = PageFactory.initElements(driver, DashBoardPage.class);
		dashboardpage.goToAddContact();

		AddContactPage fillTheForm = PageFactory.initElements(driver, AddContactPage.class);

		fillTheForm.fillTheForm(Name, Company, Email, Phone, Address, City,
				State, Zip);

		driver.close();

		driver.quit();
	}

}
