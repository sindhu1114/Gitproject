package WindowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebElement t = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		t.sendKeys("iphone7");
		Thread.sleep(3000);
		WebElement cl = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		cl.click();
		WebElement ip = driver.findElement(By.xpath("//div[@data-js-pos='0']"));
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
		WebElement iph = driver.findElement(By.xpath("//div[@data-state='Buy Now']"));
		iph.click();
		WebElement iphn= driver.findElement(By.xpath("//div[@class='you-pay']"));
		iphn.click();

}}
