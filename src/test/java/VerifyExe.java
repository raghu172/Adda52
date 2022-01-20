import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.generic.OpenBrowser;

public class VerifyExe extends OpenBrowser {

	
	
	@Test
	public void verifyFile() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 25);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Download Desktop Client']")));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
			//driver.findElement(By.xpath("//button[@title='Download Desktop Client']")).click();
		    String fileName = "Adda52Poker";
		    int waitTime = 90000;
		    System.out.println(downloadPath);
		    System.out.println(isFileDownloaded(downloadPath, fileName,waitTime));
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static boolean isFileDownloaded(String downloadPath, String fileName, int waitTime) {
		boolean fileIsDownloaded = false;
		try {
			Thread.sleep(waitTime);
			File directory = new File(downloadPath);
			File[] listFiles = directory.listFiles();
			if (listFiles.length==0 || listFiles==null) {
				System.out.println("The Directory is empty");
			}
			else  {
				
				for (File file : listFiles) {
					System.out.println(file.toString());
	                if (file.getName().contains(fileName)) {
	                    System.out.println(fileName + " is present");
	                    fileIsDownloaded = true;
	                    break;
	                }
	            }
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileIsDownloaded;
	}
	
	
	
	
}
