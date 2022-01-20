import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generic.OpenBrowser;

public class VerifyUserRedirectedToAbout extends OpenBrowser {

	
	
	@Test
	public void verifyAbout() {
		try {
			String expectedURL ="https://www.adda52.com/loyalty-program";
			driver.findElement(By.xpath("//div[@class='adv-level level1']")).click();
			Thread.sleep(5000);
			//WebElement about = driver.findElement(By.xpath("//div[@class='adv-menu desk']//a//span[@class='icon-link']"));
			driver.switchTo().frame("loyaltyIframe");
			WebDriverWait wait = new WebDriverWait(driver, 25);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='adv-menu desk']//a//span[@class='icon-link']")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='adv-menu desk']//a//span[@class='icon-link']")));
			
			
			//System.out.println(about);
			//driver.findElement(By.xpath("//div[@class='adv-menu desk']//a//span[@class='icon-link']")).click();
			//driver.findElement(By.linkText("ABOUT")).click();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@class='adv-menu desk']//a//span[@class='icon-link']")));
			
			/*Actions action = new Actions(driver);
			action.click(driver.findElement(By.xpath("//div[@class='adv-menu desk']//a//span[@class='icon-link']"))).perform();*/
			
			
			String actualURL = driver.getCurrentUrl();
			Assert.assertEquals(expectedURL, actualURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
