package Frames;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitching {
    public static void main(String[] args) {
        System.setProperty("webdiver.chrome.driver",
                "C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

        driver.findElement(By.cssSelector(".hasDatepicker")).click();

        //[id='ui-datepicker-div'] [class='ui-datepicker-title']
        //.ui-datepicker-month
        
    //    String month = driver.findElement(By.cssSelector("[id='ui-datepicker-div'] [class='ui-datepicker-title']")).getText();
    //    System.out.println(month);
    //    if(month.contains("December")){
    //     System.out.println("This block got executed");

    //    }
       while(! driver.findElement(By.cssSelector("[id='ui-datepicker-div'] [class='ui-datepicker-title']")).getText().contains("May")){
        driver.findElement(By.cssSelector("a[title='Next']")).click();
       }
       String month = driver.findElement(By.cssSelector("[id='ui-datepicker-div'] [class='ui-datepicker-title']")).getText();
       System.out.println(month);
    //     while(!month.contains("April")){
    //         driver.findElement(By.cssSelector("[class='ui-datepicker-next ui-corner-all']")).click();
    //     }
       
        List<WebElement> dates =  driver.findElements(By.className("ui-state-default"));
		
		for(int i=0; i<dates.size();i++){
            String dat= driver.findElements(By.className("ui-state-default")).get(i).getText();
			if(dat.equalsIgnoreCase("23")){
				driver.findElements(By.className("ui-state-default")).get(i).click();
			}
		}
        //demo-frame
    }
}
