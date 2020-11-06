package defaultd;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasil\\OneDrive\\Desktop\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByVisibleText("USD");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Select d=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		d.selectByValue("4");
		
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
