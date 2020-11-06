package defaultd;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5Division {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasil\\Selenium\\jar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://juliemr.github.io/protractor-demo/");
		
		driver.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("6");
	//	driver.findElement(By.xpath("//*[@ng-model='first']")).sendKeys("6");
		
		driver.findElement(By.xpath("//*[@ng-model='operator']/option[2]")).click();
		driver.findElement(By.xpath("//*[@ng-model='second']")).sendKeys("3");
		driver.findElement(By.xpath("//*[@ng-click='doAddition()']")).click();

		
		
}
}
