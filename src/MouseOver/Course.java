package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Course {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	        WebElement btn=driver.findElement(By.xpath("//body[@class='modal-open']"));
			btn.click();
			WebElement btncourse=driver.findElement(By.xpath("//a[@class='activeLink']"));
			Actions acc=new Actions(driver);
			acc.moveToElement(btncourse).perform();
			WebElement sftwre=driver.findElement(By.xpath("//span[text()='Oracle Training ']"));
			Actions acc1=new Actions(driver);
			acc1.moveToElement(sftwre).perform();
			WebElement sel=driver.findElement(By.xpath("//span[text()='Oracle SQL Training']"));
			Actions acc2=new Actions(driver);
			acc2.moveToElement(sel).perform();
			WebElement para=driver.findElement(By.xpath("//p[contains(text(),'1.Basic DATABASE Concept and SQL')]"));
			String name=para.getText();
			System.out.println(name);
}}
