package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.shopclues.com/wholesale.html");
			WebElement shop=driver.findElement(By.xpath("//a[text()='Sports & More']"));
			Actions acc=new Actions(driver);
			acc.moveToElement(shop).perform();
			WebElement shop1=driver.findElement(By.xpath("//a[@alt='Home|CT4P2|Sports & M|NA|Diet Nutrition|Weight Gainers|NA|NA|CT@Weight Gainers']"));
            shop1.click();
            WebElement shop2=driver.findElement(By.xpath("//div[@class='column col3 c1x-adzone'][1]"));
            shop2.click();
            WebElement shop3=driver.findElement(By.id("add_cart"));
            shop3.click();
            
}}
