package com.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	@FindBy(xpath="//label[text()='Username / Email / Mobile']/preceding::input[@formcontrolname='username']")
	private WebElement userName_textfield;
	@FindBy(xpath="//label[text()='Password']/preceding::input[@formcontrolname='password']")
	private WebElement password_textfield;
	@FindBy(xpath="//button[text()='LOGIN']")
	private WebElement loginButton;
	
	
	
	public void enterUserName(WebDriver driver,String userName) {
		try {
			
			driver.findElement(By.xpath("//label[text()='Username / Email / Mobile']/preceding::input[@formcontrolname='username']")).sendKeys(userName);;
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Username / Email / Mobile']/preceding::input[@formcontrolname='username']")));
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enterpassword(WebDriver driver,String password) {
		try {
			driver.findElement(By.xpath("//label[text()='Password']/preceding::input[@formcontrolname='password']")).sendKeys(password);;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickonLoginButton(WebDriver driver) {
		try {
			driver.findElement(By.xpath("//button[contains(@class,'loginBtnClicked')]")).click();;
			/*JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].clicl();", loginButton);*/
			try {
				driver.findElement(By.xpath("//button[text()='OK']")).click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
