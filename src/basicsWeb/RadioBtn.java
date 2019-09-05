package basicsWeb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioBtn {
	
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		//System.setProperty("webdriver.firefox.driver","C:\\Users\\shailesh.kumar2\\eclipse-workspace\\Selenium Libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl="https://learn.letskodeit.com/p/practice";
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("This is before method");
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
		bmwRadio.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement benzRadio = driver.findElement(By.id("benzradio"));
		benzRadio.click();
		
		
		WebElement bmwCheck = driver.findElement(By.id("bmwcheck"));
		bmwCheck.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement benzCheck = driver.findElement(By.id("benzcheck"));
		benzCheck.click();
		
		System.out.println("BMW radio btn is selected ? " + bmwRadio.isSelected());
		System.out.println("BENZ radio btn is selected ? " + benzRadio.isSelected());
		System.out.println("BMW checkbox btn is selected ? " + bmwCheck.isSelected());
		System.out.println("Benz checkbox btn is selected ? " + benzCheck.isSelected());
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		System.out.println("This is after method");
	}	

}
