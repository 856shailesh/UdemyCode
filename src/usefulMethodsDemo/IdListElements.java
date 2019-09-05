package usefulMethodsDemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdListElements {

	WebDriver driver;
	
	public  IdListElements(WebDriver driver) {
		this.driver = driver;
	}
	
	public List<WebElement> getElements(String type , String Locator) {
		type = type.toLowerCase();
		List<WebElement> elements = new ArrayList<WebElement>();
		if(type.equals("id")) {
			elements =  driver.findElements(By.id(Locator));
		} else if (type.equals("xpath")) {
			elements =  driver.findElements(By.xpath(Locator));
		} else {
			System.out.println("Type is not correct");
		} 	
		
		if(elements.isEmpty()) {
			System.out.println("Locator not found is "+ type +"and it's value is : " + Locator);
			
		} else {
			System.out.println("Locator found is "+ type +"and it's value is : " + Locator);
			
		}
		return elements;
				
	}
}

