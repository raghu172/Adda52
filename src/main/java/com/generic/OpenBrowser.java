package com.generic;

import java.awt.Window;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.repo.Cards;
import com.repo.Crown;
import com.repo.HeadUpRookie;
import com.repo.Home;
import com.repo.Login;
import com.repo.WindowHandles;

public class OpenBrowser {
	public WebDriver driver;
	public WebDriver fdriver;


	public Home home = new Home();	
	public Cards cards = new Cards();
	public HeadUpRookie rookie = new HeadUpRookie();

	public WindowHandles window = new WindowHandles();
	public DesiredCapabilities cap = new DesiredCapabilities();
	public String userName = "tejan";
	public String password ="Password@123";
	public String testurl = "https://showdown.adda52poker.com/playpoker/#/desktop";
	public DisableHarmPopup disable = new DisableHarmPopup();
	public ChromeOptions co = new ChromeOptions();
	public String downloadPath ="D:\\Adda52\\files";
	@BeforeClass
	public void openBrowser() {
		try {
			co.setExperimentalOption("prefs", disable.disableHarmPopup(downloadPath));
			cap.setCapability(ChromeOptions.CAPABILITY, co);
			cap.setBrowserName("chrome");
			URL url = new URL("http://localhost:4444/wd/hub");
			driver = new RemoteWebDriver(url,cap);
			driver.get(testurl);
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}






	@BeforeMethod
	public void loginToApplication() {
		try {
			Login login = new Login(driver);
			login.enterUserName(driver, userName);
			login.enterpassword(driver, password);
			login.clickonLoginButton(driver);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void logout() {
		try {
			//driver.findElement(By.xpath("//button[@title='LogOut']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@AfterClass
	public void closeBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
