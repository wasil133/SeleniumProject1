package defaultd;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasil\\OneDrive\\Desktop\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//a[contains(text(),'Top Deals')]")).click();
	System.out.println(driver.getTitle());
	
	
	Set<String> ids=driver.getWindowHandles();
	Iterator<String> handle=	ids.iterator();
	String parent=handle.next();
	String child=handle.next();
	driver.switchTo().window(child);
	System.out.println(driver.getTitle());
	
	driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	}

}
