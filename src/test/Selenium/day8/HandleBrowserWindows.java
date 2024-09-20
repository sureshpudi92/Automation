package day8;

import day1.SecondTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String>WindowIDs=driver.getWindowHandles();

        //Approach1
        //convert set to List
      /*  List<String> WindowList=new ArrayList(WindowIDs);

       String parentwindow= WindowList.get(0);
       String childwindow= WindowList.get(1);

       //Switch to child window
        driver.switchTo().window(childwindow);
        System.out.println(driver.getTitle());

        //Switch to parent window
        driver.switchTo().window(parentwindow);
        System.out.println(driver.getTitle());

        driver.quit();

       */
        //Approach 2
        for(String windid:WindowIDs){
          String title=  driver.switchTo().window(windid).getTitle();

          if(title.equals("OrangeHRM")){
              System.out.println(driver.getCurrentUrl());
              //Do some validations
          }
        }
        driver.quit();
    }
}
