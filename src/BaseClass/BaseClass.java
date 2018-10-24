package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver getdriver() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		return driver;
		}
	public void method1(WebElement element,String name) {
		element.sendKeys(name);
    }
	public void method2(WebElement element,String name) {
		element.click();
		}
	public void method3(WebElement element) {
		element.getText();

	}
	public void method4(WebElement element) {
		String name=element.getAttribute("value");
		System.out.println(name);
		}
	public void method5(WebDriver driver) {
		driver.getTitle();
}
	public void method6(WebDriver driver) {
		driver.getCurrentUrl();
	}
	public void method5(WebElement element) {
		element.findElement(null);
}
	public void method6(WebElement element) {
		element.findElements(null);
	}
	public void method7(WebElement element) {
		element.isDisplayed();
	}
	public void method8(WebElement element) {
		element.isEnabled();
	}}
