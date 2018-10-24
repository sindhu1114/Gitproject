package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DataWare {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	        WebElement btn=driver.findElement(By.xpath("//body[@class='modal-open']"));
			btn.click();
			WebElement btncourse=driver.findElement(By.xpath("//a[@class='activeLink']"));
			Actions acc=new Actions(driver);
			acc.moveToElement(btncourse).perform();
			WebElement sftwre=driver.findElement(By.xpath("//span[text()='Data Warehousing Training']"));
			Actions acc1=new Actions(driver);
			acc1.moveToElement(sftwre).perform();
			WebElement micro=driver.findElement(By.xpath("//span[text()='Microstrategy Training']"));
			micro.click();

}}
