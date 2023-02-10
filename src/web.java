import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {
    public static void main(String[] args) {
        System.setProperty("webdiver.chrome.driver",
                "C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.path2usa.com/travel-companion/");
        
        driver.switchTo().frame(2);
        
        driver.findElement(By.id("form-field-travel_from")).sendKeys("ind");
		//Thread.sleep(3000);
		
        // Set<String> windows = driver.getWindowHandles(); // [parent id, child]
        // Iterator<String> it = windows.iterator();
        // String parentId = it.next();
        // String childId1 = it.next();
        // String childId2 = it.next();
        // String childId3 = it.next();
        // String childId4 = it.next();
        // driver.switchTo().window(childId1);

        // int f = driver.findElements(By.tagName("form")).size();

       // driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
        
        
    }
}
