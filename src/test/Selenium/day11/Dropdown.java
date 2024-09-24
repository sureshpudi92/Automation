package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement drpCountryele=driver.findElement(By.xpath("//select[@id='country']"));
        Select country=new Select(drpCountryele);

        //country.selectByVisibleText("France");
       // country.deselectByIndex(1);
       // country.selectByValue("japan");

        // capture all options from dropdown
        List<WebElement>options=country.getOptions();
        System.out.println(options.size());//size
        for(WebElement drpOptions:options){
            System.out.println(drpOptions.getText());//printing all
        }
        driver.close();

    }
}
