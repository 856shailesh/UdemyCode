package basicsWeb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\shailesh.kumar2\\eclipse-workspace\\Selenium Libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl="https://learn.letskodeit.com/";
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("This is before method");
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		System.out.println("Clicked on Login");
		driver.findElement(By.xpath("//input[@id='user_email']")).clear();
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("test@email.com");
		driver.findElement(By.id("user_password")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		System.out.println("This is after method");
	}

	

}
