package usefulMethodsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDfile {
	
	WebDriver driver;
	
	public  IDfile(WebDriver driver) {
		driver = this.driver;
	}

	public WebElement getElement(String type, String Locator) {
		type = type.toLowerCase();
		if(type.equals("id")) {
			System.out.println("Element found with id :" + Locator);
			return this.driver.findElement(By.id(Locator));
		} else if (type.equals("xpath")) {
			System.out.println("Element found with id :" + Locator);
			return this.driver.findElement(By.xpath(Locator));
		}
		else {
			System.out.println("Return type not defined");
			return null;
		}
		
	}
	
}
