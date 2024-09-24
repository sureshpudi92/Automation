package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BootStrapDropdown {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

     driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

     //Select single element
        driver.findElement(By.xpath("//input[@value='Java']")).click();

        //capture all the options and find out size
        List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        System.out.println("No . of options "+options.size());
        for(WebElement op:options){
            System.out.println(op.getText());

            //select multiple options
            String opt=op.getText();
            if(opt.equals("MySQL") ||opt.equals("Python")||opt.equals("Oracle")){
                op.click();
            }
        }
        driver.close();
    }
}
