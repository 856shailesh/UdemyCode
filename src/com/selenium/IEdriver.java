package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEdriver {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.ie.driver","C:\\Users\\shailesh.kumar2\\eclipse-workspace\\Selenium Libraries\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.getCurrentUrl();
		
		driver.quit();
		
		
		//"C:\Users\shailesh.kumar2\eclipse-workspace\Selenium Libraries\IEDriverServer_x64_3.14.0\IEDriverServer.exe"
	}

}
