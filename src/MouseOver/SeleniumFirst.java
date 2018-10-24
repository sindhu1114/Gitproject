package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumFirst {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement s=driver.findElement(By.id("credit2"));
		WebElement t=driver.findElement(By.className("placeholder"));
		Actions acc=new Actions (driver);
		acc.dragAndDrop(s, t).perform();
		WebElement s1=driver.findElement(By.id("fourth"));
		WebElement t1=driver.findElement(By.id("amt7"));
		Actions acc1=new Actions (driver);
		acc.dragAndDrop(s1, t1).perform();
		WebElement s2=driver.findElement(By.id("credit1"));
		WebElement t2=driver.findElement(By.className("placeholder"));
		Actions acc2=new Actions (driver);
		acc.dragAndDrop(s2, t2).perform();
		WebElement s3=driver.findElement(By.id("fourth"));
		WebElement t3=driver.findElement(By.id("amt8"));
		Actions acc3=new Actions (driver);
		acc.dragAndDrop(s3, t3).perform();
		
		
		
		
		
	
		
	}
}
