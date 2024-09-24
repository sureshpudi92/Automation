package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleRadioButtons {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // select radio button
        WebElement radio_male=driver.findElement(By.xpath("//input[@id='male']"));
        WebElement radio_female=driver.findElement(By.xpath("//input[@id='female']"));

        System.out.println("Status before selecting "+radio_male.isSelected());
        System.out.println("Status before selecting "+radio_female.isSelected());
        radio_male.click();
        System.out.println("Status before selecting "+radio_male.isSelected());
        System.out.println("Status before selecting "+radio_female.isSelected());



    }
}
