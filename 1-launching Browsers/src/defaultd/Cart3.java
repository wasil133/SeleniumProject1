package defaultd;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasil\\OneDrive\\Desktop\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		
		String[] ItemsNeeded= {"Cauliflower", "Beetroot", "Banana"};
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++) {
			String[] name=products.get(i).getText().split("-");
			String FormattedName=name[0].trim();
			
			List ItemsNeededList= Arrays.asList(ItemsNeeded);
			
			
			if(ItemsNeededList.contains(FormattedName)) {
				
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
			}
			
			
			
			
			
		}
		
	}

}
