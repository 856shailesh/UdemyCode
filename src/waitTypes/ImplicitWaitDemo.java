package waitTypes;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {
	
	private WebDriver driver;
	private String BaseURl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		BaseURl = "https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("****** This is before method ********");		
	}
	
	@Test
	public void test() {
		driver.get(BaseURl);
		driver.findElement(By.linkText("Login")).click();
		System.out.println("Clicked on Login");
		driver.findElement(By.id("user[email]")).sendKeys("test");;
		driver.findElement(By.id("user_password")).sendKeys("test");
	}


	@After
	public void tearDown() throws Exception {
		System.out.println("******** This is after method ********");
		driver.quit();
		
		
	}
}
