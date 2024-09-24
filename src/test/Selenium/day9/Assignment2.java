package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.expandtesting.com/checkboxes");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        for (WebElement allcheckboxes:checkboxes){
            System.out.println("Check Boxes names "+allcheckboxes.getAccessibleName());
            if(allcheckboxes.isSelected()){
                System.out.println("Default selected check box name is "+ allcheckboxes.getAccessibleName());
            }
        }
    }


}
