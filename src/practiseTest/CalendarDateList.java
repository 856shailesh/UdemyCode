package practiseTest;


import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDateList {
	WebDriver driver;
	String BaseURL;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		BaseURL= "https://www.yatra.com/";
		
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws Exception {
		driver.get(BaseURL);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).click();
		System.out.println("Clicked on date picker");
		Thread.sleep(5000);
		WebElement date = driver.findElement(By.xpath("//table[@class='days-head day-container-table'][1]//td[@data-date='09/09/2019']"));
		date.click();
		System.out.println("Clicked on date");
		
		List<WebElement> allDates = date.findElements(By.tagName("td"));
		for (WebElement ValidDate: allDates) {
			System.out.println("Vlaue of all date is " + allDates);
			if(ValidDate.getText().equals("28")) {
				ValidDate.click();
				System.out.println("Clicked on 28th date");
				break;
			}
		}
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
