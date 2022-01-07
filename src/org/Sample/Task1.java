package org.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\admin\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	WebElement txtFrom = driver.findElement(By.id("src"));
	txtFrom.sendKeys("Chennai");
	WebElement txtTo = driver.findElement(By.id("dest"));
	txtTo.sendKeys("Salem");
	}
}
