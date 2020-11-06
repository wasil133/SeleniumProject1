package defaultd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {
		
		String browser="chrome";
		WebDriver driver=null; 
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasil\\OneDrive\\Desktop\\Selenium1\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://google.com");
			driver.close();
		}
		else if(browser.contentEquals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\wasil\\Selenium\\jar\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.bestbuy.com");
			driver.close();
			
			
		}
		
		
		
	
	
	

	}

}
