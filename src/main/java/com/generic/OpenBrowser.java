package com.generic;

import java.awt.Window;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.repo.HeadUpRookie;
import com.repo.Home;
import com.repo.Login;
import com.repo.WindowHandles;

public class OpenBrowser {
public WebDriver driver;
public WebDriver fdriver;
public WebDriverWait wait;
public Login login = new Login();
public Home home = new Home();
public HeadUpRookie rookie = new HeadUpRookie();

public WindowHandles window = new WindowHandles();
public DesiredCapabilities cap = new DesiredCapabilities();
	@BeforeMethod
	public void openBrowser() {
		try {
			cap.setBrowserName("chrome");
			URL url = new URL("http://localhost:4444/wd/hub");
			
			driver = new RemoteWebDriver(url,cap);
			driver.get("https://showdown.adda52poker.com/playpoker/#/desktop");
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void closeBrowser() {
		try {
			//driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
