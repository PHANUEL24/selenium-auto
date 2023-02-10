package Assessments;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/shop");
		
		List<WebElement> ls = driver.findElements(By.cssSelector(".col-lg-3.col-md-6.mb-3"));
		
		//.card-footer
		for(int i=0; i<ls.size();i++) {
			driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();
		}
		
		
		
	}

}
