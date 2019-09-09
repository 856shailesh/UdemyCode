package practiseTest;


import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {
	WebDriver driver;
	String BaseURl;	
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		BaseURl = "https://www.google.com/";
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(BaseURl);
		WebElement searchBar = driver.findElement(By.xpath("//input[@name='q']"));
		searchBar.click();
		System.out.println("Clicked on Search Bar");
		searchBar.sendKeys("Greater Noida");
		
		Thread.sleep(3000);
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//li[@class='sbct']"));
		int size = dropdown.size();
		System.out.println("Size of dropdown is :" + size);
		
		for (int i=0;i<size-1 ; i++) {
			System.out.println("This dropdown cointains : " + dropdown.get(i).getText());
		}	
		Thread.sleep(3000);	
			
	}
	
	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		
		for (int i = 0;i< length ; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
		
	}
	

	@After
	public void tearDown() throws Exception {
		String filename = getRandomString(10) + ".png";
		String dir = "C://Users//shailesh.kumar2//eclipse-workspace//Screenshots//";
		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(dir + filename));
		
		driver.quit();
		
	}

}
