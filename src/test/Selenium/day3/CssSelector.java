package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //tag id  tag#id
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("tshirts");
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("tshirts");

        //tag classname  tag.classname
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("tshirts");
        //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("tshirts");

        //tag attribute  tag[attribute=value]
        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("tshirts");
        //driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("tshirts");

       // tag class attribute   tag.classname[attribute='value']
        driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("tsirts");
        //driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("tsirts");


        driver.close();
    }
}
