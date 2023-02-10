import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdiver.chrome.driver",
                "C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/loginpagePractise");

        driver.findElement(By.cssSelector(".blinkingText")).click();

        Set<String> windows = driver.getWindowHandles(); // [parent id, child]
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ")[4]);

	}

}
