package defaultd;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasil\\OneDrive\\Desktop\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
	//get or navigate
		driver.get("https://www.dice.com");
		driver.get("https://www.indeed.com");
		
	//navigate back
		driver.navigate().back();
		
	//Title
		String title= driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());

	//navigate forward
		driver.navigate().forward();
		
	//current URL
		
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
