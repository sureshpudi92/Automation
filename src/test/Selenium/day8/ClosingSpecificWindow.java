package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class ClosingSpecificWindow {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> WindowIDs=driver.getWindowHandles();

        for(String windid:WindowIDs) {
            String title = driver.switchTo().window(windid).getTitle();
            System.out.println(title);
            if (title.equals("OrangeHRM")|| title.equals("other window"))
            {

                driver.close();
                
            }

        }
        driver.quit();

    }
}
