package com.repo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Cards {

	
	
	public boolean verifyCardsIsdisplayedin_Ch(WebDriver driver) throws IOException {
		
		boolean cards_ch = false;
		try {
			cards_ch=driver.findElement(By.xpath("//div[@class='card-face flex-horz-cntr']")).isDisplayed();
			System.out.println(cards_ch);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cards_ch;
	}
	
	
	public boolean verifyCardsIsdisplayedin_Fire(WebDriver fdriver) {
		boolean cards_fire = false;
		try {
			cards_fire=fdriver.findElement(By.xpath("//div[@class='card-face flex-horz-cntr']")).isDisplayed();
			System.out.println(cards_fire);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cards_fire;
	}
	
}
