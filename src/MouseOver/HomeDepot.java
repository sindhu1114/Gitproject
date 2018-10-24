package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.homedepot.com/");
	        WebElement btncourse=driver.findElement(By.xpath("//a[@class='ShoppingLinks__link js__flyout--open']"));
			Actions acc=new Actions(driver);
			acc.moveToElement(btncourse).perform();
			WebElement sftwre=driver.findElement(By.xpath("//a[@class='MainFlyout__link MainFlyout__link--active']"));
			Actions acc1=new Actions(driver);
			acc1.moveToElement(sftwre).perform();
			WebElement micro=driver.findElement(By.xpath("//*[@id=\"allDepartmentsFlyout\"]/section[2]/div/ul/li[7]/a"));
			Actions acc2=new Actions(driver);
			acc2.moveToElement(micro).perform();
			WebElement port=driver.findElement(By.xpath("//a[@title='Portable Air Conditioners']"));
			port.click();


}}
