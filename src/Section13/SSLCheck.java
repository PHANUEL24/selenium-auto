package Section13;

import java.util.*;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] agrs) {
		
		//Chrome options are for setting how the browser should behave
		//this is for chrome
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		//setting proxy
		Proxy pro = new Proxy();
		pro.setHttpProxy("ipaddress:444");
		options.setCapability("proxy", pro);
		
		//Setting a storage file when download
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "path");
		options.setExperimentalOption("prefs", prefs);
		
		
		//this is for firefox
		//FirefoxOptions options1 = new FirefoxOptions();
		//options1.setAcceptInsecureCerts(true);
		
		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com");
		
		System.out.println(driver.getTitle());
	}

}
