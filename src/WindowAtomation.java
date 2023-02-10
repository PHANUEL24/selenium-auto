import java.util.*;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAtomation {
    public static void main(String[] args) {
        System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("blinkingText")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it= windows.iterator();
        String parentId = it.next();
        String childId =it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.cssSelector(".im-para.red")).getText();
    }
}
