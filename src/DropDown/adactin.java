package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://adactin.com/HotelApp/");
			WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
			username.sendKeys("sindhu14");
			WebElement pswrd=driver.findElement(By.xpath("//input[@id='password']"));
			pswrd.sendKeys("Manu@123");
			WebElement lgn=driver.findElement(By.xpath("//input[@id='login']"));
			lgn.click();


}}
