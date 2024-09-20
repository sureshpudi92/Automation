package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepMethod {
    public static void main(String[] args) throws InterruptedException {

        /*

        Error: NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//*[@name='username' or @placeholder='Username']"}
         */  WebDriver driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@name='username' or @placeholder='Username']")).sendKeys("Admin");

        driver.close();
    }
}
