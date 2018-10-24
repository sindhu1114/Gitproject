package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.shopclues.com/wholesale.html");
			WebElement shop=driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
			Actions acc=new Actions(driver);
			acc.moveToElement(shop).perform();
			WebElement shop1=driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
			shop1.click();

}}
