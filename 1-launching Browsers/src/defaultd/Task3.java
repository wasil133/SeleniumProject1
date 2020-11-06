package defaultd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasil\\OneDrive\\Desktop\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		// driver.findElement(By.name("q")).sendKeys("afghanistan");
		
		
		driver.findElement(By.cssSelector("#email")).sendKeys("what");
		driver.findElement(By.name("email")).sendKeys("wasilk1");
		driver.findElement(By.name("pass")).sendKeys("af1");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
		driver.navigate().back();
		 
		
	}

}
