package com.generic;

import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchAnyBrowser {

	
	
	
	public WebDriver launchAnyBrowser(WebDriver driver,String browserName, String url) {
	//	WebDriver driver=null;
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName(browserName);
			URL hubURL = new URL("http://localhost:4444/wd/hub");
			driver = new RemoteWebDriver(hubURL,cap);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			/*WebElement userName1 = driver.findElement(By.xpath("//label[text()='Username / Email / Mobile']/preceding::input[@formcontrolname='username']"));
			WebElement password1 = driver.findElement(By.xpath("//label[text()='Password']/preceding::input[@formcontrolname='password']"));
			WebElement loginButton1 = driver.findElement(By.xpath("//button[contains(@class,'loginBtnClicked')]"));
			userName1.sendKeys("mohit", Keys.TAB);
			password1.sendKeys("a");
			loginButton1.click();*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
	
	
	
	public String handleWindow(WebDriver driver) {
		String chromeTab = null;
		try {
			chromeTab = driver.getWindowHandle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return chromeTab;
	}
	
	public String handleWindow(WebDriver driver, String changeWindow) {
		String chromeTab = null;
		String fireTab = null;
		try {
			chromeTab = driver.getWindowHandle();
			Set<String> allWin = driver.getWindowHandles();
			for (String win : allWin) {
				if (!win.contains(chromeTab)) {
					fireTab = win;
					driver.switchTo().window(win);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fireTab;
	}
	
	
	public WebDriver openFireFox(WebDriver driver,String hubURL,String testurl, String userName, String password) {
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(CapabilityType.PLATFORM_NAME, Platform.WIN10);
			cap.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
			URL url = new URL(hubURL);
			driver = new RemoteWebDriver(url,cap);
			driver.get(testurl);
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		} catch (Exception e) {
		e.printStackTrace();
		}
		return driver;
	}
	
	public void clickOnElement(String locatorValue) {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public WebDriver driverCast(WebDriver driver) {
		WebDriver driver1 = null;
		try {
			FirefoxDriver fdriver = (FirefoxDriver)driver;
			driver1=fdriver;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver1;
	}
	
	
	
	
	
	
}
