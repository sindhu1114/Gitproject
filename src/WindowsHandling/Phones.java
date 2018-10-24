package WindowsHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phones {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement cls = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		cls.click();
		Thread.sleep(3000);
		WebElement search= driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("mobiles");
		WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
		sub.click();
		Thread.sleep(8000);
		WebElement phone1 = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]"));
		phone1.click();
		Thread.sleep(8000);
		String wndw1 = driver.getWindowHandle();
		System.out.println(wndw1);
		Set<String> allwindowsid = driver.getWindowHandles();
		System.out.println(allwindowsid);
		for (String x : allwindowsid) {
			if (!wndw1.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		Thread.sleep(8000);
		WebElement add = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		add.click();
		List<String> emp = new ArrayList<>();
		emp.addAll(allwindowsid);
		driver.switchTo().window(emp.get(0));
		Thread.sleep(8000);
		WebElement phone2 = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[2]"));
		phone2.click();
		Thread.sleep(8000);
		String wndw2 = driver.getWindowHandle();
		System.out.println(wndw2);
		Set<String> allwindowsid1 = driver.getWindowHandles();
		System.out.println(allwindowsid1);
		for (String x : allwindowsid1) {
			if (!wndw2.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		Thread.sleep(8000);
		 WebElement notify = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		 notify.sendKeys("manu123@gmail.com");
		 WebElement me = driver.findElement(By.xpath("//button[text()='NOTIFY ME']"));
		 me.click();
		 List<String> emp1 = new ArrayList<>();
			emp1.addAll(allwindowsid);
			driver.switchTo().window(emp.get(0));
			Thread.sleep(8000);
			WebElement phone3 = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[3]"));
			phone3.click();
			Thread.sleep(8000);
			String wndw3 = driver.getWindowHandle();
			System.out.println(wndw3);
			Set<String> allwindowsid2 = driver.getWindowHandles();
			System.out.println(allwindowsid2);
			for (String x : allwindowsid2) {
				if (!wndw3.equals(x)) {
					driver.switchTo().window(x);
				}
			}
			
			WebElement notify1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			 notify1.sendKeys("manu123@gmail.com");
			 WebElement me1 = driver.findElement(By.xpath("//button[text()='NOTIFY ME']"));
			 me1.click();
			 List<String> emp2 = new ArrayList<>();
				emp2.addAll(allwindowsid);
				driver.switchTo().window(emp.get(0));
				Thread.sleep(8000);
				WebElement phone4 = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[4]"));
				phone4.click();
				Thread.sleep(8000);
				String wndw4 = driver.getWindowHandle();
				System.out.println(wndw4);
				Set<String> allwindowsid3 = driver.getWindowHandles();
				System.out.println(allwindowsid3);
				for (String x : allwindowsid3) {
					if (!wndw4.equals(x)) {
						driver.switchTo().window(x);
					}
				}
				WebElement add1 = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
				add1.click();	
				List<String> emp3 = new ArrayList<>();
				emp3.addAll(allwindowsid);
				driver.switchTo().window(emp.get(0));
				Thread.sleep(8000);
				WebElement phone5 = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[5]"));
				phone5.click();
				Thread.sleep(8000);
				String wndw5 = driver.getWindowHandle();
				System.out.println(wndw5);
				Set<String> allwindowsid4 = driver.getWindowHandles();
				System.out.println(allwindowsid4);
				for (String x : allwindowsid4) {
					if (!wndw5.equals(x)) {
						driver.switchTo().window(x);
					}
				}
				WebElement add2 = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
				add2.click();
				List<String> emp4 = new ArrayList<>();
				emp4.addAll(allwindowsid);
				driver.switchTo().window(emp.get(0));
				Thread.sleep(8000);
				WebElement phone6 = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[6]"));
				phone6.click();
				Thread.sleep(8000);
				String wndw6 = driver.getWindowHandle();
				System.out.println(wndw6);
				Set<String> allwindowsid5 = driver.getWindowHandles();
				System.out.println(allwindowsid5);
				for (String x : allwindowsid5) {
					if (!wndw6.equals(x)) {
						driver.switchTo().window(x);
					}
				}
				WebElement add3 = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
				add3.click();
	}
}

