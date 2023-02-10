package CalendarPractice;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DayPicker {

	public static void main(String[] args) {
		
		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wit = new  WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		//driver.findElement(By.id("datepicker")).click();
		//
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		driver.findElement(By.cssSelector(".hasDatepicker")).click();
		
		wit.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-state-default")));
		//.ui-state-default
		List<WebElement> dates = driver.findElements(By.cssSelector(".ui-state-default"));
		
		for(int i=0; i<dates.size();i++){
			if(dates.contains("23")){
				driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
			}
		}
		
		//[class='ui-datepicker-next ui-corner-all']
		// driver.findElement(By.id("datepicker")).click();
		
		

	}

}
