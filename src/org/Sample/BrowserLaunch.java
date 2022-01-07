package org.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
//Assigning Reference and Object
WebDriver driver = new ChromeDriver();
//Maximize the Window
driver.manage().window().maximize();
//launching URL
driver.get("https://www.facebook.com/");
//Type User name
WebElement txtUserName = driver.findElement(By.id("email"));
 txtUserName.sendKeys("GreensTech@gmail.com");
 //Type Password
 WebElement txtPassword = driver.findElement(By.name("pass"));
 txtPassword.sendKeys("Jaya@1234");
	}
}
