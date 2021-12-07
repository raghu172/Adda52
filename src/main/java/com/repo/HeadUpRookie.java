package com.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeadUpRookie {

	
	
	public void clickOnRegisterButton_ch(WebDriver driver) {
		try {
			if (driver!=null) {
				driver.findElement(By.xpath("//button[text()=' REGISTER ']")).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void clickOnRegisterButton_fire(WebDriver fdriver) {
		try {
			if (fdriver!=null) {
				fdriver.findElement(By.xpath("//button[text()=' REGISTER ']")).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
