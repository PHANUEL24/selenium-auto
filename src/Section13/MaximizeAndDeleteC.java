package Section13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndDeleteC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//deleting all cookies
		driver.manage().deleteAllCookies();
		
		//if you want to delete a cookie name
		//driver.manage().deleteCookieNamed("asdf");
		
		//session 
		//driver.manage().getCookieNamed("sessionKey");
		
		//click on any link to be redirected to a log in page after deleting the cookie
		
		
		driver.get("http://google.com");
	}

}
