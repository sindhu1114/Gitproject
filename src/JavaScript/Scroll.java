package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(3000);
		WebElement user = driver.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[].ScrollIntoView(true)",user);
		String name=user.getText();
		System.out.println(name);
}}
