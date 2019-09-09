package practiseTest;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class AutoSuggestion {
	WebDriver driver;
	String BaseURl;	
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		BaseURl = "https://www.google.com/";
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(BaseURl);
		WebElement searchBar = driver.findElement(By.xpath("//input[@name='q']"));
		searchBar.click();
		System.out.println("Clicked on Search Bar");
		searchBar.sendKeys("Dauji");
		
		Thread.sleep(3000);
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//li[@class='sbct']"));
		int size = dropdown.size();
		System.out.println("Size of dropdown is :" + size);
		
		for (int i=0;i<size-1 ; i++) {
			System.out.println("This dropdown cointains : " + dropdown.get(i).getText());
		}	
		Thread.sleep(3000);	
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
