package MouseOver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Icici {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement close=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		close.click();
		//WebElement user=driver.findElement(By.className("_2zrpKA"));
		//user.sendKeys("9962089728");
		//WebElement pass=driver.findElement(By.className("_2zrpKA _3v41xv"));
		//pass.sendKeys("Sindhu14");
		//WebElement login=driver.findElement(By.className("_2AkmmA _1LctnI _7UHT_c"));
		//login.click();
	    Actions acc=new Actions(driver);
		WebElement shop=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		acc.moveToElement(shop).perform();
		WebElement shop1=driver.findElement(By.xpath("//a[text()='Chairs']"));
		Actions acc1=new Actions(driver);
		acc.moveToElement(shop1).perform();
		WebElement shop2=driver.findElement(By.className("_3BTv9X _3MSCRn"));
		shop2.click();
		WebElement shop3=driver.findElement(By.className("_2AkmmA _2Npkh4 _2MWPVK"));
		shop3.click();
		
		
	
		
	
		
	}
}




