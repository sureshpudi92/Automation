package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone");
        //Xpath--Following
        driver.findElement(By.xpath("//input[@name='search']/following::button[1]")).click();
    }
}
