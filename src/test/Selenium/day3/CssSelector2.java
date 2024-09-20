package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssSelector2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //tag id               tagname#id
        driver.findElement(By.cssSelector("form#form-currency")).click();

        System.out.println("pass");


        // tag classname   tagname.classname
        driver.findElement(By.cssSelector("img.img-fluid"));
        System.out.println("pass1");

        // tag classname attribute

        String title=driver.findElement(By.cssSelector("img.img-fluid[title='Your Store']")).getText();
        System.out.println(title);
        System.out.println("pass2");
        //tag attribute   tagname[attribute='value']

        driver.findElement(By.cssSelector("a[title='Shopping Cart']")).click();
        System.out.println("pass3");


        driver.close();


    }
}
