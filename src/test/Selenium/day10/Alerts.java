package day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement js_alert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        WebElement js_confirm=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        WebElement js_prompt=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));

        //1.Norml Alert ok
        //js_alert.click();
       //Alert myalert= driver.switchTo().alert();
            //myalert.accept();

        //2. Confirmation alert  ok or cancel
             //js_confirm.click();
            //driver.switchTo().alert().dismiss();

        //3.promt alert input
        js_prompt.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("test");
        driver.switchTo().alert().accept();
        String result=driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(result);
        if(result.contains("test")) {
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
            driver.quit();

    }
}
