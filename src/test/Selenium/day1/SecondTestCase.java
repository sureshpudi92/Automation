package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Assignment
public class SecondTestCase {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com/");
        String title=driver.getTitle();
        System.out.println(title);
        if(title.equals("Google")) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        driver.close();
    }



}
