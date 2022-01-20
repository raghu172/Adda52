package com.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Crown {

	@FindBy(xpath="//div[@class='adv-level level1']")
	private WebElement adda52Advantage;
	
	@FindBy(xpath ="//div[@class='adv-crown-text']")
	private WebElement verifyCrown;
	
	
	
	public Crown(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnAdda52Advantagebutton(WebDriver driver) {
		try {
			//WebDriverWait wait = new WebDriverWait(driver, 25);
			//wait.until(ExpectedConditions.visibilityOf(adda52Advantage));
			Thread.sleep(2000);
			adda52Advantage.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String verifyCrown(WebDriver driver) {
		String crownNum = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 25);
			wait.until(ExpectedConditions.visibilityOf(verifyCrown));
			//Thread.sleep(3000);
			if (verifyCrown.isDisplayed()) {
				crownNum=verifyCrown.getText();
			}
			else {
				System.out.println("Crown is not displayed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return crownNum;
	}
}
