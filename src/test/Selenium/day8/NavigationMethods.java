package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class NavigationMethods {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // driver.get("https://demo.nopcommerce.com/"); Accepts url only string format

        //Navigate().to()---Alternate to get()
        //driver.navigate().to("https://demo.nopcommerce.com/");
        URL myurl=new URL("https://demo.nopcommerce.com/"); //object format
        driver.navigate().to(myurl);
        driver.navigate().to("https://demo.opencart.com/");
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        System.out.println("pass");
        driver.quit();
    }
}
