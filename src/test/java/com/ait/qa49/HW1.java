package com.ait.qa49;

import org.openqa.selenium.By;
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


    @Test
    public void findElementBySimpleLocators() {
        driver.findElement(By.id("bar-notification"));

        driver.findElement(By.className("center-3"));

        driver.findElement(By.linkText("Computers"));
    }

    @Test
    public void findElementByCssSelectorTest() {
        driver.findElement(By.cssSelector("#mob-top-menu "));

        driver.findElement(By.cssSelector(".header"));

        driver.findElement(By.cssSelector("[href='/login?url=%2Fsearch']"));

        driver.findElement(By.cssSelector("[href*='login']"));

        driver.findElement(By.cssSelector("[href^='/log']"));

        driver.findElement(By.cssSelector("[href$='search']"));

    }

        @AfterMethod
        public void tearDown () {
            driver.quit();
        }
    }

