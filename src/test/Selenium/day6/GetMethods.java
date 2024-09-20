package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        //get title
        String title= driver.getTitle();
        System.out.println(title);
        //get url
        String url=driver.getCurrentUrl();
        System.out.println(url);
        // get page source
        System.out.println(driver.getPageSource());

        // get window handles
       String WindowID= driver.getWindowHandle();
        System.out.println(WindowID);

        Thread.sleep(3000);
        // get window handles
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Thread.sleep(5000);

        Set<String>MultipleWindowIDs=driver.getWindowHandles();

        System.out.println(MultipleWindowIDs);
        //close current window
        //driver.close();

        //close all open windows by driver
        driver.quit();

    }
}
