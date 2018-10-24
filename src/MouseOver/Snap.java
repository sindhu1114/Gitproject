package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement t=driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		Actions acc=new Actions (driver);
		acc.moveToElement(t).perform();
		WebElement text=driver.findElement(By.xpath("//span[text()='New Launches Covers']"));
		text.click();
		
}}
