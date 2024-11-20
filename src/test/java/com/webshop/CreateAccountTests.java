package com.webshop;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        int i = (int) (System.currentTimeMillis() / 1000 % 3600);
        click(By.cssSelector("[href='/register']"));

        type(By.name("FirstNAme"), "Jessee");

        type(By.name("LastNAme"), "Pinkman");

        type(By.name("Email"), "pinkman1@gmai.com");

        type(By.name("Password"), "123456");

        type(By.name("ConfirmPassword"), "123456");

        driver.findElement(By.tagName("register-button"));

        Assert.assertTrue(isElementPresent(By.xpath("//h1")));



    }



}
