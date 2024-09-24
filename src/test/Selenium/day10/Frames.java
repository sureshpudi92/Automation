package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));

        //frame1
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");

        driver.switchTo().defaultContent();
        //frame2
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Automation");

        driver.switchTo().defaultContent();
        //frame3
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Testing");

        //Switch to innerframe/nested frame
        //iframes: to embed content from another site

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id='i5']//div[@class='AB7Lab Id5V1']")).click();
        System.out.println("pass");



        driver.close();
    }
}
