import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.generic.OpenBrowser;

public class ChangePassword extends OpenBrowser {

	
	@Test
	public void test1() {
		try {
			System.out.println(driver.getTitle());
			/*login.enterUserName(driver);
			login.enterpassword(driver);
			login.clickonLoginButton(driver);*/
			
			WebElement userName = driver.findElement(By.xpath("//label[text()='Username / Email / Mobile']/preceding::input[@formcontrolname='username']"));
			WebElement password = driver.findElement(By.xpath("//label[text()='Password']/preceding::input[@formcontrolname='password']"));
			WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,'loginBtnClicked')]"));
			//wait.until(ExpectedConditions.elementToBeClickable(userName));
			JavascriptExecutor js =(JavascriptExecutor)driver;
			
			//js.executeScript("arguments[0].value='tejan'", userName);
			//js.executeScript("arguments[0].value='sitanshu'", password);
			userName.sendKeys("tejan", Keys.TAB);
			password.sendKeys("sitanshu");
			System.out.println(loginButton.isEnabled());
			//password.sendKeys("sitanshu",Keys.ENTER);
			//wait.until(ExpectedConditions.elementToBeClickable(loginButton));
			Thread.sleep(3000);
			try {
				js.executeScript("arguments[0].click();", loginButton);		
				
			} catch (Exception e) {
				//loginButton.click();
				e.printStackTrace();
			}
			try {
				driver.findElement(By.xpath("//button[text()='OK']")).click();
			} catch (Exception e) {
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//div[@title='Game and Lobby Settings']")).click();
			
			
			String parent = driver.getWindowHandle();
			System.out.println(parent);
			Set<String> listOfWin = driver.getWindowHandles();
			System.out.println(listOfWin.size());
			for (String string : listOfWin) {
				if (!parent.contains(string)) {
					System.out.println(string);
					driver.switchTo().window(string);
					driver.findElement(By.xpath("//LI[text()=\"Requests\"]")).click();
					driver.findElement(By.xpath("//SPAN[text()=\"Change Password\"]")).click();
					driver.findElement(By.xpath("//label[text()='Old Password ']/following::input[@attr.auto-id='oldPasswordTextBox']")).sendKeys("sitanshu", Keys.TAB);
					driver.findElement(By.xpath("//label[text()='New Password ']/following::input[@attr.auto-id='newPasswordTextBox']")).sendKeys("Password@123", Keys.TAB);
					driver.findElement(By.xpath("//label[text()='Confirm Password ']/following::input[@attr.auto-id='confirmPasswordTextBox']")).sendKeys("Password@123");
					driver.findElement(By.xpath("//button[text()=' UPDATE ']")).click();
					driver.close();
					//
				}
				//break;
				//
			}
			driver.switchTo().window(parent);
			driver.findElement(By.id("logoutBtn")).click();
			driver.findElement(By.xpath("//button[text()=' LOGIN ']")).click();;
			//password.clear();
			driver.findElement(By.xpath("//label[text()='Password']/preceding::input[@formcontrolname='password']")).sendKeys("Password@123");;
			js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[contains(@class,'loginBtnClicked')]")));	
			
			
			
			
			
			
			System.out.println(driver.getTitle());
			//System.out.println("clicked");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public DesiredCapabilities setImplicitWait(WebDriver driver, DesiredCapabilities cap, String browserName) {
		try {
			cap.setBrowserName(browserName);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cap;
	}
	
	
	public WebDriver setImplicitWait(WebDriver driver) {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
	
	
	public void clickOnElement(WebDriver driver, String name) {
		try {
			WebElement elementName = driver.findElement(By.xpath(name));
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", elementName);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public String switchToWindow(WebDriver driver) {
		String parent= null;
		try {
			parent = driver.getWindowHandle();
			Set<String> listOfWin = driver.getWindowHandles();
			for (String expectedWin : listOfWin) {
				if (!parent.contains(expectedWin)) {
					driver.switchTo().window(expectedWin);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return parent;
	}
	
	
	
	
	
	
	
}
