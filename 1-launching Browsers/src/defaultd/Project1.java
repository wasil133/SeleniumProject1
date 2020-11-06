package defaultd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project1 {

	private static final WebDriver WebDriverRefrence = null;
	private static final long TimeOut = 0;

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasil\\Selenium\\jar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(WebDriverRefrence, TimeOut);
	//	wait.until(ExpectedConditions.visibilityOfAllElements(By.xpath(xpathExpression)))
		
	//	driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[1]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[10]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'column-a\']")).click();
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[11]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'dropdown\']/option[3]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[22]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[1]/a")).click();
		System.out.println(driver.findElement(By.cssSelector("body")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
	
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[33]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'content\']/div/a")).click();
		System.out.println(driver.findElement(By.cssSelector("body > div.example > h3")).getText());
		driver.navigate().back();
		

	
	}

}
