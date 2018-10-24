package WindowsHandling;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;






public class Address {
	public static void main(String[] args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		WebElement ryt=driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		Actions acc=new Actions(driver);
		acc.contextClick(ryt).perform();
		Robot r=new Robot();
		for (int i = 1; i <= 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease (KeyEvent.VK_ENTER);
			String nm = driver.getWindowHandle();
			System.out.println(nm);
			Set<String> allwindowsid = driver.getWindowHandles();
			System.out.println(allwindowsid);
			for (String x : allwindowsid) {
				if (!nm.equals(x)) {
					driver.switchTo().window(x);
				}
			}
			TakesScreenshot tk=(TakesScreenshot)driver;
			File S=tk.getScreenshotAs(OutputType.FILE);
			System.out.println(S);
			File d=new File("C:\\Users\\Best\\Desktop\\task");
			FileUtils.copyFile(S, d);
			
		}
		

}
