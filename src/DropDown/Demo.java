package DropDown;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
			WebElement frstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			frstname.sendKeys("sindhu");
			WebElement lstname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			lstname.sendKeys("manoj");
			WebElement add=driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
			add.sendKeys("madurai");
			WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
			email.sendKeys("manu@gmail.com");
			WebElement phn=driver.findElement(By.xpath("//input[@type='tel']"));
			phn.sendKeys("123456");
			WebElement gdr=driver.findElement(By.xpath("//input[@value='FeMale']"));
			gdr.click();
			WebElement hby=driver.findElement(By.xpath("//input[@id='checkbox2']"));
			hby.click();
			WebElement lang=driver.findElement(By.xpath("//body[@class='ng-scope']"));
			lang.sendKeys("english");
			WebElement slct=driver.findElement(By.xpath("//select[@id='Skills']"));
			Select s=new Select(slct);
			s.selectByIndex(5);
			WebElement cntry=driver.findElement(By.xpath("//select[@id='countries']"));
			Select s1=new Select(cntry);
			s.selectByIndex(5);
			WebElement date=driver.findElement(By.xpath("//select[@id='yearbox']"));
			Select s2=new Select(date);
			s2.selectByIndex(1);
			WebElement mnth=driver.findElement(By.xpath("//select[@placeholder='Month']"));
			Select s3=new Select(mnth);
			s3.selectByIndex(1);
			List<WebElement> month=s3.getOptions();
			for (WebElement x : month) {
				String name=x.getText();
				System.out.println(name);
			}
			WebElement yr=driver.findElement(By.xpath("//select[@id='daybox']"));
			Select s4=new Select(yr);
			s4.selectByIndex(2);
			
			
			
			
}}
