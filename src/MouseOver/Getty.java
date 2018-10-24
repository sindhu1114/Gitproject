package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Getty {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.gettyimages.in/");
			WebElement shop=driver.findElement(By.xpath("//a[@data-nav='nav_Editorial'][1]"));
			shop.click();
			WebElement shop1=driver.findElement(By.xpath("//a[@data-nav='nav_Editorial_Entertainment'][1]"));
			shop1.click();

}}
