package com.webshop;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        int i = (int) (System.currentTimeMillis() / 1000 % 3600);
        click(By.cssSelector("[href='/register']"));



        type(By.name("FirstName"), "Boby");

        type(By.name("LastName"), "Marley");

        type(By.name("Email"), "pinkman1" + i +"@gmai.com");

        type(By.name("Password"), "123456");

        type(By.name("ConfirmPassword"), "123456");

        click(By.name("register-button"));

        Assert.assertTrue(isElementPresent(By.xpath("//h1")));
        System.out.println("result " + driver.findElement(By.xpath("//h1")).getText());



    }



}
