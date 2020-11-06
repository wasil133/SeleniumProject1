package defaultd;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasil\\OneDrive\\Desktop\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("essa");
		driver.findElement(By.id("pass")).sendKeys("wahdflaksdfja");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		
	}

}
