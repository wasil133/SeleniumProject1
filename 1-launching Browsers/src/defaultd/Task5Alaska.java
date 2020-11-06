package defaultd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5Alaska {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasil\\Selenium\\jar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.alaskaair.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'oneWay\']")).click();
		driver.findElement(By.xpath("//*[@id=\'fromCity1\']")).sendKeys("Washington");
		driver.findElement(By.xpath("//*[@id=\'toCity1\']")).sendKeys("Istanbul");
	//	driver.findElement(By.xpath("//*[@id='day3']")).click();
	//	driver.findElement(By.xpath("//*[@id=\'day25\']")).click();
		driver.findElement(By.xpath("//*[@id=\'findFlights\']")).click();

	
	}

}
