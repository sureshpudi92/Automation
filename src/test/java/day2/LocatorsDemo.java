package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
          // driver.findElement(By.name("search")).sendKeys("Mac");
         //Boolean  logodisplaystatus= driver.findElement(By.id("logo")).isDisplayed();
         // System.out.println(logodisplaystatus);
        //driver.findElement(By.linkText("Tablets")).click();
       // driver.findElement(By.partialLinkText("Laptops")).click();
       // List<WebElement>headerlinks=driver.findElements(By.className("list-inline-item"));
       // System.out.println("total no of header links:"+headerlinks.size());

      List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        List<WebElement> Images=driver.findElements(By.tagName("img"));
        System.out.println(Images.size());


        driver.quit();
    }
}
