package com.generic;

import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DisableHarmPopup {

	
	
	public HashMap<String, Object> disableHarmPopup(String downloadPath) {
		HashMap<String, Object> hs = null;
		try {
			hs = new HashMap<String, Object>();
			hs.put("download.default_directory", downloadPath);
			hs.put("safebrowsing.enabled", "true"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hs;
	}
	
	
	
	
	
	
	public DesiredCapabilities setChromeOptions(DesiredCapabilities cap, HashMap<String, Object> hs) {
		try {
			ChromeOptions co = new ChromeOptions();
			co.setExperimentalOption("prefs", hs);
			cap.setCapability(ChromeOptions.CAPABILITY, co);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cap;
	}
}
