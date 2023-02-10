package Section13;

import java.io.IOException;
import java.net.*;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//step 1: is to get all url's i=using selenium
		//Java for calling url's and gets you the status code
		
		//String url =driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		
		
		//grab every link and iterate through the links.
		List <WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for(WebElement link: links) {
			String url =link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int rC = conn.getResponseCode();
			System.out.println(rC);
			a.assertTrue(rC<400, "The link with text: "+link.getText()+" is Broken with code: "+rC);
//			if(rC>400) {
//				System.out.println("The link with text: "+link.getText()+" is Broken with code: "+rC);
//				Assert.assertTrue(false);
//			}
		}
		a.assertAll();
		
	}

}
