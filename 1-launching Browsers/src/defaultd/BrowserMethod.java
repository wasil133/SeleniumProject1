package defaultd;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasil\\OneDrive\\Desktop\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
	//get
		//driver.get("https://www.bbc.om");
		driver.get("https://www.wellsfargo.com");
	
	//navigate
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
	//getTitle
		String title=driver.getTitle();
		System.out.println(title);
	
	//getCurrentURL
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	//close and quit
		driver.quit();
	//	driver.close();
	}

}
