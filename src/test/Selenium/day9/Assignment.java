package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Assignment {
    public static void main(String[] args) {

        //Capture default selected radio button
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.expandtesting.com/radio-buttons");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       List<WebElement> colors =driver.findElements(By.xpath("//input[@class='form-check-input' and @type='radio' and @name='color']"));
//        for (int i=0;i<colors.size();i++){
//
//            System.out.println(colors.get(i).isSelected());
//
//            if(colors.get(i).isSelected()){
//                System.out.println("Default selected dropdown is "+colors.get(i).getAccessibleName()+" color");
//                break;
//            }
//
//        }
        for (WebElement radiosbuttons:colors){
            if(radiosbuttons.isSelected()){
                System.out.println("Default selected dropdown is "+radiosbuttons.getAccessibleName()+" color");
               break;
            }
        }
        driver.quit();

    }
}
