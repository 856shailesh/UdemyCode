package basicsWeb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListofElements {
	
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl="https://learn.letskodeit.com/p/practice";
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("This is before method");
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		
		WebElement dropdown = driver.findElement(By.id("carselect"));
		Select sel = new Select(dropdown);
		
		sel.selectByIndex(1);
		
		List <WebElement> options = sel.getOptions();
		int size = options.size();
		
		for (int i=0;i<size;i++) {
			String optionName = options.get(i).getText();
			System.out.println("Options are : " + optionName);
			
		}	
			
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		System.out.println("This is after method");
	}	

}
