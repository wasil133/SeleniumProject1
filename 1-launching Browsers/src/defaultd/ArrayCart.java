package defaultd;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasil\\OneDrive\\Desktop\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		String[] ItemsNeeded= {"Brocolli", "Cauliflower"};
		
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		
		
		List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++) {
			
		String[] name= products.get(i).getText().split("-"); //format it after this to get that the actual veg-name
		
		String formattedName=name[0].trim();
															//name[1] 1 Kg
		
		
														//check whether names you extract are present in aray or not
														//convert array into array list for easy search
		List ItemsNeededList= Arrays.asList(ItemsNeeded);
		
		
			if(ItemsNeededList.contains(formattedName)) {
		
		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
	

	}

		}}

	}


