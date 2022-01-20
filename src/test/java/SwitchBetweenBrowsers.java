import java.io.File;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.generic.LaunchAnyBrowser;

public class SwitchBetweenBrowsers {

	public WebDriver driver;
	public DesiredCapabilities cap = new DesiredCapabilities();
	public LaunchAnyBrowser launch = new LaunchAnyBrowser();
	@Test
	public void test1() {
		try {
			//open chrome browser
			cap.setBrowserName("chrome");
			URL url = new URL("http://localhost:4444/wd/hub");
			driver = new RemoteWebDriver(url,cap);
			driver.get("https://showdown.adda52poker.com/playpoker/#/desktop");
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			String chromeParent = driver.getWindowHandle();
			System.out.println(chromeParent);;
			System.out.println("chrome instance "+driver);
			
				
			
			//open firefox browser
			//driver=launch.launchAnyBrowser(driver, "firefox", "https://showdown.adda52poker.com/playpoker/#/desktop");
			//System.out.println("firefox instance "+driver);
			/*String firefoxParent = driver.getWindowHandle();
			System.out.println("fire"+firefoxParent);;
			

			Set<String> listOfWin = driver.getWindowHandles();
			for (String childWin : listOfWin) {
				System.out.println(childWin);
				if (!chromeParent.contains(childWin)) {
					
					driver.switchTo().window(childWin);
					driver.findElement(By.xpath("//label[text()='Username / Email / Mobile']/preceding::input[@formcontrolname='username']")).sendKeys("mohit");
				}
				
			}
			
			Thread.sleep(2000);*/
			//driver.findElement(By.xpath("//label[text()='Username / Email / Mobile']/preceding::input[@formcontrolname='username']")).sendKeys("tejan");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
