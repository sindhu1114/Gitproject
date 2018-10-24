package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com");
        WebElement user = driver.findElement(By.xpath("//div[text()='Log In/Sign Up']"));
		user.click();
		driver.switchTo().frame(1);
		 WebElement user1 = driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']"));
		 user1.click();
		 WebElement user2 = driver.findElement(By.xpath("//button[@class='md-raised md-primary btn-new mt-20 login-btn md-button ng-scope md-default-theme']"));
		 user2.click();
		 Alert al=driver.switchTo().alert();
		 al.accept();
		

}}
