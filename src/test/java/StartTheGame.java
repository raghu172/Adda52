import static org.testng.Assert.assertEquals;

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
	public Login login = new Login(driver);
	@Test
	public void test2() {
		boolean cardisDisplayed_ch = false;
		boolean expectedResult = true;
		boolean cardisDisplayed_fire = false;
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
			fdriver=launch.launchAnyBrowser(driver, browserName, url);
			login.enterUserName(fdriver,userName_fi);
			login.enterpassword(fdriver, password_fi);
			login.clickonLoginButton(fdriver);
			
			String firefoxTab = driver.getWindowHandle();
			
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
			
			//Verify cards displayed in chrome tab
			cardisDisplayed_ch=cards.verifyCardsIsdisplayedin_Ch(driver);
			
			//Verify cards displayed in firefox tab
			cardisDisplayed_fire=cards.verifyCardsIsdisplayedin_Fire(fdriver);
			
			//if displayed in chrome tab
			assertEquals(cardisDisplayed_ch, expectedResult);
			
			//if displayed in firefox tab
			assertEquals(cardisDisplayed_fire, expectedResult);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
