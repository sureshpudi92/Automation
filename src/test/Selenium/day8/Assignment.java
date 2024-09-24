package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/*
Assignment
----------
https://testautomationpractice.blogspot.com/

1) provide some string search for it
2) count number of links
3) click on each link using for loop
4) get window ID's for every browser window
5) close specific browser window


 */

public class Assignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com");

        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("testing");
        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']//following::span[1]")).click();
        List<WebElement>AllLinks= driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
        System.out.println(AllLinks.size());
        for (WebElement link:AllLinks) {

            System.out.println(link.getText());

            link.click();
        }
            Set<String> WindowIDs=driver.getWindowHandles();
            for (String WinID:WindowIDs){

                String title=driver.switchTo().window(WinID).getTitle();
                System.out.println(title);
                if(title.equals("Testing cosmetics on animals - Wikipedia")){
                    driver.close();
                }


            }
            driver.quit();





    }

}
