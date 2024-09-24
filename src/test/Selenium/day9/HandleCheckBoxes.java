package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckBoxes {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1. Select CheckBox
       WebElement checkbox= driver.findElement(By.xpath("//input[@id='sunday']"));

        // System.out.println("status of before selecting checkbox "+checkbox.isSelected());
         //checkbox.click();
        //System.out.println("status of after selecting checkbox "+checkbox.isSelected());

        //2.Capturing all check boxes

      List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        System.out.println(checkboxes.size());//7

        //3. select all check boxes
//        for (int i=0;i<checkboxes.size();i++){
//            checkboxes.get(i).click();
//            System.out.println(checkboxes.get(i).getAccessibleName());
//        }

       // for (WebElement allcheckboxes:checkboxes){
        //    allcheckboxes.click();
       // }

        //4. select last 3 check boxes
        //total o of checkboxes-how many check boxes want to select=staring index
        //7-3=4

       // for (int i=4;i<checkboxes.size();i++) {
        //    checkboxes.get(i).click();
        //}

        //5. select first 3 check boxes

       // for (int i=0;i<3;i++) {
        //    checkboxes.get(i).click();
       // }

        //6. Select/unselect checkboxes
        /*for (WebElement chkbox:checkboxes)
        {
            if(chkbox.isSelected()){
                chkbox.click();
            }else {
                chkbox.click();
            }
        } */

//        7. select specific check boxes randomly
//        for (int i=0;i<checkboxes.size();i++){
//            if(i==0 || i==3||i==7){
//                checkboxes.get(i).click();
//            }
//        }

        //8. select  check box based on value

        String weekname="monday1";
        switch (weekname){
            case "sunday": driver.findElement(By.xpath("//input[@id='sunday']")).click();
            break;
            case "monday": driver.findElement(By.xpath("//input[@id='monday']")).click();
                break;
            case "tuesday": driver.findElement(By.xpath("//input[@id='tuesday']")).click();
                break;
            case "wednesday": driver.findElement(By.xpath("//input[@id='wednesday']")).click();
                break;
            case "thursday": driver.findElement(By.xpath("//input[@id='thursday']")).click();
                break;
            case "friday": driver.findElement(By.xpath("//input[@id='friday']")).click();
                break;
            case "saturday": driver.findElement(By.xpath("//input[@id='saturday']")).click();
                break;
            default:
                System.out.println("invalid week");
        }

        driver.quit();

    }


}
