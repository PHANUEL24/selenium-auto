package Assessments;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdiver.gecko.driver", "C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		WebDriverWait wit = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");

		driver.findElement(By.xpath("//input[@value='user']")).click();

		wit.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();

		WebElement staticDropdown = driver.findElement(By.cssSelector("select.form-control"));

		Select dropDown = new Select(staticDropdown);

		dropDown.selectByIndex(2);

		driver.findElement(By.cssSelector("input[id='terms']")).click();

		driver.findElement(By.cssSelector("input[id='signInBtn']")).click();

//		Thread.sleep(3000);
		wit.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List<WebElement> ls = driver.findElements(By.cssSelector(".col-lg-3.col-md-6.mb-3"));

		// .card-footer
		for (int i = 0; i < ls.size(); i++) {
			driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();
		}

	}

}
