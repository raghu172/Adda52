import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.generic.LaunchAnyBrowser;
import com.generic.OpenBrowser;
import com.repo.Login;

public class StartTheGame extends OpenBrowser {
	
	public LaunchAnyBrowser launch = new LaunchAnyBrowser();
	public String browserName = "firefox";
	public String url = "https://showdown.adda52poker.com/playpoker/#/desktop";
	
	@Test
	public void test2() {
		
		try {
			//Login in chrome
			String userName_ch = "tejan";
			String password_ch ="sitanshu";
			login.enterUserName(driver,userName_ch);
			login.enterpassword(driver, password_ch);
			login.clickonLoginButton(driver);
			
			String chromeTab = driver.getWindowHandle();
			//Login in firefox
			String userName_fi = "mohit";
			String password_fi ="a";
			fdriver=launch.launchAnyBrowser(fdriver, browserName, url);
			login.enterUserName(fdriver,userName_fi);
			login.enterpassword(fdriver, password_fi);
			login.clickonLoginButton(fdriver);
			
			String firefoxTab = fdriver.getWindowHandle();
			
			//click on SIT & GO in chrome tab
			home.clickOnSitbuttoninCh(driver);
			
			//click on SIT & GO in firefox tab
			home.clickOnSitbuttoninFire(fdriver);
			
			//click on registering button in chrome tab
			home.clickOnRegisteringButton_ch(driver);
			
			//click on registering button in firefox tab
			home.clickOnRegisteringButton_fire(fdriver);
			
			//switch to child window in chrome tab
			chromeTab=window.windowHandlesInCh(driver);	
			
			//switch to child window in firefox tab
			firefoxTab=window.windowHandlesInFire(fdriver);
			
			//click on register button in chrome tab
			rookie.clickOnRegisterButton_ch(driver);
			

			//click on register button in firefox tab
			rookie.clickOnRegisterButton_fire(fdriver);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
