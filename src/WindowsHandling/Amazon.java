package WindowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement t = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		t.sendKeys("iphone x case");
		WebElement cl = driver.findElement(By.xpath("//input[@value='Go']"));
		cl.click();
		WebElement ip = driver.findElement(By.xpath("//h2[@data-attribute='iPhone X Case, Slim Tempered Glass Back Cover, Scratch-Resistant Soft Silicone Bumper, Shock Absorption, Compatible for iPhone X/iPhone 10 (Pink)']"));
		ip.click();
		WebElement iph = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		iph.click();
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
		WebElement iphn = driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']"));
		String name = iphn.getText();
		System.out.println(name);
}}
