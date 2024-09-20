package day1;

/*
1.open chrome browser
2.navigate to https://demo.opencart.com/
3.validate title should be "your store"
4.close browser
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        // when object created for chromeDriver class then the constructor will invoke automatically and launch browser
        driver.get("https://demo.opencart.com/");
        String act_title= driver.getTitle();
        if(act_title.equals("Your Store")) {
            System.out.println("Test Passed");
        }else {

            System.out.println("Test failed");
        }
        driver.close();
    }

}
