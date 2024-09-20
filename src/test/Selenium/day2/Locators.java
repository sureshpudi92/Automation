package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //name--locator

        //WebElement SeachBox=driver.findElement(By.name("search"));-----locating element
        //SeachBox.sendKeys("iphone");----perform action on web element

        //driver.findElement(By.name("search")).sendKeys("iphone");


        //id---locator
        WebElement logo=driver.findElement(By.id("logo"));
       boolean status= logo.isDisplayed();
        System.out.println("Display Status "+ status);

        // Imp Point:To do multiple actions on same element then we can create a variable and use.

        // Link Text and partial Link Test---only for links

        //driver.findElement(By.linkText("Desktops")).click(); //Link Text
        //driver.findElement(By.partialLinkText("Desk")).click();//Partial Link Text
        //System.out.println("pass");

        // Class Name
       List<WebElement> headerLinks= driver.findElements(By.className("list-inline-item"));
        System.out.println(headerLinks.size()); //7

        //TagName
        List<WebElement> TotalLinks= driver.findElements(By.tagName("a"));
        System.out.println(TotalLinks.size()); //76

        List<WebElement> TotalImages= driver.findElements(By.tagName("img"));
        System.out.println(TotalImages.size()); //18


        //driver.findElement(By.id("xyz")); //No Such Element exception
        List<WebElement> TotalImages1= driver.findElements(By.tagName("xyz"));
        System.out.println(TotalImages1.size());  //0








        driver.close();
    }
}
