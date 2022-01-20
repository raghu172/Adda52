import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.generic.OpenBrowser;
import com.repo.Crown;

public class VerifyTheCrown extends OpenBrowser {

	public Crown crown = new Crown(driver);
	
	
	@Test
	public void verifyCrown() {
		try {
			driver.findElement(By.xpath("//div[@class='adv-level level1']")).click();
			//driver.findElement(By.xpath("//div[@class='dialog-close csr-hand ng-star-inserted']")).click();
			//crown.clickOnAdda52Advantagebutton(driver);
			/*String crownNum=crown.verifyCrown(driver);
			System.out.println(crownNum);*/
			//WebDriverWait wait = new WebDriverWait(driver, 25);
			//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='adv-crown-text']"))));
			Thread.sleep(5000);
			//if (driver.findElement(By.xpath("//div[@class='adv-crown-text']")).isDisplayed()) {
			driver.switchTo().frame("loyaltyIframe");
			WebDriverWait wait = new WebDriverWait(driver, 25);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//section[@class='section']//div[@class='adv-crown-right flex-both-cntr']/div")));
			
			String txt=driver.findElement(By.xpath("//div[@class='adv-crown-text']")).getText();
			System.out.println(txt);
			//WebElement crown = driver.findElement(By.className("adv-crown-right flex-both-cntr"));
			//System.out.println(driver.findElement(By.xpath("//div[@class='adv-crown-right flex-both-cntr']/div")));
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("return document.getElementByXPath(\"//section[@class='section']//div[@class='adv-crown-right flex-both-cntr']/div\");", driver.findElement(By.xpath("//section[@class='section']//div[@class='adv-crown-right flex-both-cntr']/div")));
			
			/*JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
			String text = (String) jsExecutor.executeScript("return arguments[0].text", driver.findElement(By.xpath("//section[@class='section']//div[@class='adv-crown-right flex-both-cntr']/div")));  
			System.out.println(text); */
			
			
			
			
			
			/*List<WebElement> list = driver.findElements(By.xpath("//div[text()='100']"));
			for (WebElement webElement : list) {
				System.out.println(webElement.getText());
			}*/
			
			//Thread.sleep(8000);	
			//String crownNum=driver.findElement(By.xpath("//div[@class='adv-crown-text']")).getText();
			//System.out.println(crownNum);
			//}
			//else {
				//System.out.println("Crown is not displayed");
			//}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
