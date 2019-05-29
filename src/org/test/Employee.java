package org.test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sambath\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login?lang=en");
		WebElement user=driver.findElement(By.className("js-username-field email-input js-initial-focus"));
		user.sendKeys("Hello");s
		WebElement pass=driver.findElement(By.xpath("(//input[@type='password'])[2])"));
		pass.sendKeys("1234");
		//typecast
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].setAttribute('value','kaviya')",user);
		//js.executeScript("arguments[0].SetAttribute('value','1234')",pass);


		
	
		
		
		
		
	}

}
