package com.ait.qa49;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HW1 {
    WebDriver driver;

    @BeforeMethod
    public void SetUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://demowebshop.tricentis.com/");

    }

    @Test
    public void openDemowebshop() {
        System.out.println("Site is open");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
