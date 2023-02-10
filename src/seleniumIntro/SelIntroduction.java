package seleniumIntro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver ->methods==> Automating chrome browser
		// firefox - FirefoxDriver -> 
		//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdiver.chrome.driver",
                "C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//Firefox launch--- . geckodriver --. key = webdriver.gecko.driver
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/geckodriver.exe");
		
//		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/edgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
