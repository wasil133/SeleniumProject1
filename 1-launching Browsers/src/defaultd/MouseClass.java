package defaultd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClass {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasil\\OneDrive\\Desktop\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		
	Actions mouse=new Actions(driver);
		mouse.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		Thread.sleep(2000);
		
		mouse.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("afghanistan").doubleClick().build().perform();
		Thread.sleep(2000);
		
		mouse.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'& Orders')]"))).contextClick().build().perform();
		
	}

}
