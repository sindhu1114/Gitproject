package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tools {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://toolsqa.com/automation-practice-form/");
			WebElement frstname=driver.findElement(By.xpath("//input[@name='firstname']"));
			frstname.sendKeys("sindhu");
			WebElement lstname=driver.findElement(By.xpath("//input[@name='lastname']"));
			lstname.sendKeys("manoj");
			WebElement sx=driver.findElement(By.xpath("//input[@value='Female']"));
			sx.click();
			WebElement exp=driver.findElement(By.xpath("//input[@value='2']"));
			exp.click();
			WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
			date.sendKeys("14/6/94");
			WebElement pf=driver.findElement(By.xpath("//input[@value='Automation Tester']"));
			pf.click();
			WebElement at=driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
			at.click();
			WebElement cntnt=driver.findElement(By.xpath("//select[@id='continents']"));
			Select s1=new Select(cntnt);
			s1.selectByIndex(2);
			List<WebElement>cntnt1=s1.getOptions();
			for (WebElement x : cntnt1) {
				String name=x.getText();
				System.out.println(name);
				
			}
			WebElement sc=driver.findElement(By.xpath("//select[@id='selenium_commands']"));
			Select s2=new Select(sc);
			s2.selectByIndex(2);
			
				
			}}
			
			
			
			



