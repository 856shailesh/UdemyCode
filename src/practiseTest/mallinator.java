package practiseTest;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mallinator {

	WebDriver driver;
	String BaseURl;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		BaseURl = "https://www.mailinator.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		driver.get(BaseURl);
		WebElement Emailbtn = driver.findElement(By.linkText("EMAIL"));
		Emailbtn.click();
		System.out.println("Clicked on Email button");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement inboxField = driver.findElement(By.id("inbox_field"));
		inboxField.sendKeys("qatest");
		System.out.println("Entered Qa test");
		
		driver.findElement(By.id("go_inbox")).click();
		System.out.println("Clicked on Go button");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement field = driver.findElement(By.xpath("//tr[@id='row_qatest-1568181624-29051371']//td[4]/a"));
		String fieldtext = field.getText();
		field.click();
		System.out.println("Cliked on message :" + fieldtext);
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
