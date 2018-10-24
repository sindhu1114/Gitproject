package WindowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lvb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		WebElement t = driver.findElement(By.xpath("//a[@href='javascript:forgetPassword();']"));
		t.click();
		Thread.sleep(3000);
		String nm = driver.getWindowHandle();
		System.out.println(nm);
		Set<String> allwindowsid = driver.getWindowHandles();
		System.out.println(allwindowsid);
		for (String x : allwindowsid) {
			if (!nm.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		WebElement cl = driver.findElement(By.xpath("//a[text()='Reset Login password']"));
		cl.click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		String nme = driver.getWindowHandle();
		System.out.println(nm);
		Set<String> allwindowsid1 = driver.getWindowHandles();
		System.out.println(allwindowsid1);
		for (String x : allwindowsid1) {
			if (!nm.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		WebElement ip = driver.findElement(By.id("fldUId"));
		ip.sendKeys("561789");
		Thread.sleep(3000);
		WebElement iph = driver.findElement(By.xpath("//a[@onclick='return userSubmit();']"));
		iph.click();
		WebElement iphn = driver.findElement(By.xpath("//td[@class='PageHeading']"));
		String name=iphn.getText();
		System.out.println(name);

}}
