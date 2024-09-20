package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWiat {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        //ExplicitWait Declartion
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        //ExplicitWait Usage

      WebElement UserName= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username' or @placeholder='Username']")));
        UserName.sendKeys("Admin");
        WebElement Password= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='password']")));
                Password.sendKeys("admin123");
                WebElement login=mywait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
                login.click();
        driver.close();
    }
}
