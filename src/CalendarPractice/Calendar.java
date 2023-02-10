package CalendarPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date1']")).click();
		// .ui-state-default.ui-state-highlight
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		// input[id='ctl00_mainContent_view_date1']
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
