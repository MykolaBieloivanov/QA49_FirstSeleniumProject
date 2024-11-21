package com.webshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/register");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }


    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }


    public void clickOnRegisterButton() {
        click(By.name("register-button"));
    }

    public void fillRegisterLoginForm(Customer customer) {
        type(By.name("FirstName"), customer.getFirstName());

        type(By.name("LastName"), customer.getLastName());

        type(By.name("Email"), customer.getEmail());

        type(By.name("Password"), customer.getPassword());

        type(By.name("ConfirmPassword"), customer.getRepeatPassword());
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }

    public boolean isElementExist() {
        return isElementPresent(By.xpath("//h1"));
    }
}

