package javaScriptExecution;


import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptHeightWidth {
	
	private WebDriver driver;
	String baseURl;
	private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
	driver = new ChromeDriver();
	baseURl = "https://www.google.com";
	js = (JavascriptExecutor) driver;
	
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	}

	@Test
	public void test() {
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice';");
		
		long height = (long) js.executeScript("return window.innerHeight");
		long width = (long) js.executeScript("return window.innerWidth");
		
		System.out.println("Height is :" + height);
		System.out.println("Width is :" + width);
	}

	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	
}
