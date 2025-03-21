package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTestCase {

    WebDriver driver; // Declare WebDriver at the class level

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver(); // Initialize WebDriver
        driver.manage().window().maximize(); // Maximize browser window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com/"); // Open Google
    }

    @Test
    public void verifyTitle() {
        String act_title = driver.getTitle();
        System.out.println("Actual Title: " + act_title);
        Assert.assertEquals(act_title, "Google", "Title does not match");
    }

    @AfterTest
    public void teardown() {
        driver.quit(); // Close the browser
    }
}
