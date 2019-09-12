package actionClass;


import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	private WebDriver driver;
	private String baseURl;


	@Before
	public void setUp() throws Exception {
	driver = new ChromeDriver();
	baseURl = "https://demoqa.com/menu/";
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURl);
		
		WebElement element = driver.findElement(By.xpath("//div[@id='ui-id-9']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		Thread.sleep(2000);
		
		WebElement subelement = driver.findElement(By.id("ui-id-17"));
		action.moveToElement(subelement).click().perform();		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
