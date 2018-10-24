package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ThirdDay {
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			WebElement shop=driver.findElement(By.id("nav-link-shopall"));
			Actions acc=new Actions(driver);
			acc.moveToElement(shop).perform();
			WebElement shop1=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
			Actions acc1=new Actions(driver);
			acc.moveToElement(shop1).perform();
			WebElement shop2=driver.findElement(By.xpath("//span[text()='Power Banks']"));
			shop2.click();
			
		

		}
	}


