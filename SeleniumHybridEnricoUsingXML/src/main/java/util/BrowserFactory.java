package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;

	public static WebDriver startBrowser(String browserName, String url) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(url);
		return driver;

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * ".\\drivers\\chromedriver.exe"); driver = new ChromeDriver();
		 * driver.get(url); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * driver.manage().deleteAllCookies(); return driver;
		 */
	}

}
