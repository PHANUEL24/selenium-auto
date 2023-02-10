package CalendarPractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");

		// Date Selection

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();

		while (!driver.findElement(By.cssSelector("div[class='ui-datepicker-title'] [class='ui-datepicker-month']"))
				.getText().contains("May"))

		{

			// driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

			driver.findElement(By.xpath(
					"//a[@class='ui-datepicker-next ui-corner-all']/span[@class='ui-icon ui-icon-circle-triangle-e']"))
					.click();

		}

		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));

		int count = dates.size();

		for (int i = 0; i < count; i++)

		{

			String txt = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td")).get(i)
					.getText();

			if (txt.equalsIgnoreCase("16"))

			{

				driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td")).get(i).click();

				System.out.println(txt);

				break;

			}

		}

	}

}
