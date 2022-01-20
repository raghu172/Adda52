package com.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	
	
	public void clickOnSitbuttoninCh(WebDriver driver) {
		try {
			if (driver!=null) {
				driver.findElement(By.xpath("//a[text()='Sit & Go']")).click();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void clickOnRegisteringButton_ch(WebDriver driver) {
		try {
			if (driver!=null) {
				driver.findElement(By.xpath("//span[text()='Heads-Up Novice-92']/ancestor::tr//span[text()='Registering']")).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void clickOnSitbuttoninFire(WebDriver fdriver) {
		try {
			if (fdriver!=null) {
				fdriver.findElement(By.xpath("//a[text()='Sit & Go']")).click();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickOnRegisteringButton_fire(WebDriver fdriver) {
		try {
			if (fdriver!=null) {
				fdriver.findElement(By.xpath("//span[text()='Heads-Up Novice-92']/ancestor::tr//span[text()='Registering']")).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
