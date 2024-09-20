package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        // IS Displayed
      boolean displayStatus=  driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println(displayStatus);

        // IS Enabled ----//Input boxes,buttons,radio buttons....etc
        boolean searchboxStatus =driver.findElement(By.xpath("//*[@placeholder='Search store']")).isEnabled();
        System.out.println(searchboxStatus);

        // IS Selected ---Radio buttons and check boxes
        WebElement male_rd=driver.findElement(By.cssSelector("input#gender-male"));
        WebElement female_rd=driver.findElement(By.cssSelector("input#gender-female"));
        System.out.println(male_rd.isSelected());
        System.out.println(female_rd.isSelected());
        male_rd.click();
        System.out.println(male_rd.isSelected());
        System.out.println(female_rd.isSelected());
        female_rd.click();
        System.out.println(male_rd.isSelected());
        System.out.println(female_rd.isSelected());


        boolean newsletterstatus=driver.findElement(By.xpath("//input[contains(@id,'Newsletter')]")).isSelected();
        System.out.println("news letter status: "+newsletterstatus);

        driver.close();
    }
}
