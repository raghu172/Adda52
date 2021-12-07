package com.repo;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandles {

	
	
	
	public String windowHandlesInCh(WebDriver driver) {
		String parent_ch = null;
		try {
			parent_ch = driver.getWindowHandle();
			Set<String> all = driver.getWindowHandles();
			for (String child : all) {
				if (!parent_ch.contains(child)) {
					driver.switchTo().window(child);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return parent_ch;
	}
	
	
	
	
	public void switchToParentWin_Ch(WebDriver driver, String parent_ch) {
		try {
			driver.switchTo().window(parent_ch);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String windowHandlesInFire(WebDriver fdriver) {
		String parent_fire = null;
		try {
			parent_fire = fdriver.getWindowHandle();
			Set<String> all = fdriver.getWindowHandles();
			for (String child : all) {
				if (!parent_fire.contains(child)) {
					fdriver.switchTo().window(child);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return parent_fire;
	}
	
	
	public void switchToParentWin_Fire(WebDriver fdriver, String parent_fire) {
		try {
			fdriver.switchTo().window(parent_fire);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
