package WindowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
        Thread.sleep(8000);
		WebElement ip = driver.findElement(By.xpath("//div[text()='Apple iPhone 7 (Black, 32 GB)']"));
		ip.click();
		Thread.sleep(8000);
		String nm = driver.getWindowHandle();
		System.out.println(nm);
		Set<String> allwindowsid = driver.getWindowHandles();
		System.out.println(allwindowsid);
		for (String x : allwindowsid) {
			if (!nm.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		Thread.sleep(8000);
		WebElement iph = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		Thread.sleep(4000);
		iph.click();
		Thread.sleep(8000);
		WebElement iphn = driver.findElement(By.xpath("//span[@class='pMSy0p XU9vZa']"));
		String name = iphn.getText();
		System.out.println(name);
	}
}
