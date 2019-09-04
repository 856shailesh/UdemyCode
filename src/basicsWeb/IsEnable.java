package basicsWeb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {
	
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\shailesh.kumar2\\eclipse-workspace\\Selenium Libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl="https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("This is before method");
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement e1 = driver.findElement(By.xpath("//div[@class='RNNXgb']"));
		System.out.println("e1 is enabled ?" + e1.isEnabled());
		
		WebElement e2 = driver.findElement(By.xpath("//div[@class='vdLsw gsfi']"));
		System.out.println("e2 is enabled ?" + e2.isEnabled());
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		System.out.println("This is after method");
	}

	

}
