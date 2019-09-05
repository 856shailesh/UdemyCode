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

public class ListDropdown {
	
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
		WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
		bmwRadio.click();
		
		List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@type='radio']"));
		int size = radioBtns.size();
		System.out.println("Size of the list is +" + size );
		boolean isChecked = false;
		
		for(int i=0;i<size;i++) {
			isChecked = radioBtns.get(i).isSelected();
			
			if(!isChecked) {
				radioBtns.get(i).click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				System.out.println("Clicked on element " + radioBtns.get(i));
			}
			else {
				System.out.println("Element already selected");
			}
		}	
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		System.out.println("This is after method");
	}	

}
