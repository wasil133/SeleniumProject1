package defaultd;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasil\\OneDrive\\Desktop\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		if(driver.getTitle().contains("computer")) {
			System.out.println("Verified");
		}
		else {
			System.out.println("Not verified");
		}
		driver.close();
		
	}

}
