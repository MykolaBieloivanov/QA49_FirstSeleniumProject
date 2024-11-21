package com.webshop;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        int i = (int) (System.currentTimeMillis() / 1000 % 3600);

        clickOnRegisterLink();

        fillRegisterLoginForm(new Customer()
                .setFirstName("Bob")
                .setLastName("Marley")
                .setPassword("123456")
                .setRepeatPassword("123456")
                .setEmail("pinkman1" + i + "@gmai.com"));

        clickOnRegisterButton();

        Assert.assertTrue(isElementExist());
    }

}
