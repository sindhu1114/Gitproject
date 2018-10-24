package WindowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ceiling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		WebElement t = driver.findElement(By.id("headerSearch"));
		t.sendKeys("ceiling fan");
		Thread.sleep(8000);
		WebElement cl = driver.findElement(By.xpath("//button[@title='Submit Search']"));
		cl.click();
		Thread.sleep(8000);
		WebElement ip = driver.findElement(By.xpath("//div[@class='js-pod  js-pod-0 plp-pod plp-pod--default pod-item--0']"));
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
		Thread.sleep(5000);
		WebElement iph = driver.findElement(By.xpath("//span[text()=' Sign in ']"));
		iph.click();
		
}}



