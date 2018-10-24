package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement shop3=driver.findElement(By.className("modal-header"));
		shop3.click();
		WebElement shop=driver.findElement(By.xpath("//a[@class='activeLink']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(shop).perform();
		WebElement shop1=driver.findElement(By.xpath("//span[text()='Software Testing Training ']"));
		Actions acc1=new Actions(driver);
		acc1.moveToElement(shop1).perform();
		WebElement shop2=driver.findElement(By.xpath("//span[text()='Selenium Training']"));
		Actions acc2=new Actions(driver);
		acc2.moveToElement(shop1).perform();
		
	}
}
