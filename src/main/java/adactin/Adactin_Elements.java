package adactin;

import org.openqa.selenium.By;

import Utils.Resuable_Methods;

public class Adactin_Elements extends Resuable_Methods {
	
	public By Username=By.id("username");
	public By Password=By.name("password");
	public By Submit=By.xpath("//input[@type='Submit']");
	
	
	
	public void Adactin_Credentials() {
		
		driver.findElement(Username).sendKeys("chandra12345");
		driver.findElement(Password).sendKeys("Chandu");
		driver.findElement(Submit).click();
	}

}
