package DropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown = new Select(staticDropdown);
		dropDown.selectByIndex(3);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		//Select using visible text
		dropDown.selectByVisibleText("AED");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		//Select by value
		dropDown.selectByValue("INR");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
	}

}
