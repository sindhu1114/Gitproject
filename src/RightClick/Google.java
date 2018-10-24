package RightClick;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
			WebElement ryt=driver.findElement(By.xpath("http://www.greenstechnologys.com/selenium-course-content.html"));
		    Actions ac=new Actions(driver);
			ac.contextClick(ryt).perform();
			//Robot r=new Robot();
			//r.keyPress(KeyEvent.VK_ENTER);
			//r.keyPress(KeyEvent.VK_A);
			//r.keyRelease(KeyEvent.VK_ENTER);
			//r.keyRelease(KeyEvent.VK_A);
			
			
			
			

}}
