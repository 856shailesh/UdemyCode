package javaScriptExecution;


import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecution {
	
	private WebDriver driver;
	String baseURl;
	private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
	driver = new ChromeDriver();
	baseURl = "https://www.google.com";
	js = (JavascriptExecutor) driver;
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	}

	@Test
	public void test() {
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice';");
		
		WebElement textBox = (WebElement) js.executeScript("return document.getElementById('name');");
		textBox.sendKeys("test");
	}

	
	@After
	public void tearDown() throws Exception {
	}

	
}
