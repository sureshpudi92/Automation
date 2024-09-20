package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        //xpath syntax
        //Sigle attribute
        //tagname[@attribute='value']

        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //Xpath with Sigle attribute
        //tagname[@attribute='value']
       // driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("MacBook");
        //driver.findElement(By.xpath("//button[@class='btn btn-light btn-lg']")).click();

        //Xpath with multiple attributes
        //driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("MacBook");
        //System.out.println("pass");

        //Xpath with 'and'  'or' opeartors
        //driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("MacBook");
        //driver.findElement(By.xpath("//input[@placeholder='Search' or @name='search']")).sendKeys("MacBook");

        //Xpath with text()

        //driver.findElement(By.xpath("//a[text()='Desktops']")).click();
       boolean displaystatus= driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
        System.out.println(displaystatus);

        //Xpath  with contains()
       // driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("iphone");

        //Xpath  with Strats-with()
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("iphone");

        //Chained Xpath

       boolean logo= driver.findElement(By.xpath("//*[@id='logo']/a/img")).isDisplayed();
        System.out.println(logo);


        driver.close();








    }
}
