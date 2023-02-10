package greenKart;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseAmazonQ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Declare expected array

		String[] itemNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		// implicit wait-- This is declared globally
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//explicit wait works for a specific element and it not declared global
		WebDriverWait wit = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		Thread.sleep(3000);
		
		addItems(driver, itemNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		//explicit wait
		wit.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//explicit wait for the following element
		wit.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		// explicit wait target a specific element
		// there are two ways to define explicit wait

//		WebDriverWait w = new WebDriverWait(driver, 5);

	}

	public static void addItems(WebDriver driver, String[] itemNeeded) {
		int j = 0;
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < items.size(); i++) {

			String[] itemName = items.get(i).getText().split("-");
			String formattedName = itemName[0].trim();

			// convert Array to arrayList
			List itemNeededList = Arrays.asList(itemNeeded);

			if (itemNeededList.contains(formattedName)) {
				j++;
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemNeeded.length)
					break;

			}
		}

	}

}
