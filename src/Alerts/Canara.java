package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canara {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sprint.com/#");
		WebElement lgn = driver.findElement(By.xpath("//a[@class='sprint-header-transfer__permalink sprint-header-caret']"));
		lgn.click();
		WebElement user = driver.findElement(By.id("loginHeaderButton"));
		user.click();
	    Alert al=driver.switchTo().alert();
		al.accept();
		

}}
