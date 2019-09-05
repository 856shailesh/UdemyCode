package usefulMethodsDemo;


import java.util.concurrent.TimeUnit;
import usefulMethodsDemo.IDfile;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GenericMethodDemo {
	
	private WebDriver driver;
	private String baseUrl;
	private IDfile gm;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl="https://learn.letskodeit.com/p/practice";
		gm = new IDfile(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("This is before method");
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		
		WebElement btnElement = gm.getElement("id", "benzradio");
		String btnText = btnElement.getText();
		System.out.println("Text of the element is :" + btnText);	
			
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		System.out.println("This is after method");
	}	

}
