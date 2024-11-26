package com.webshop;

import models.Customer;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataProvider;

public class CreateAccountTests extends TestBase {

    @Test (dataProvider = "addNewCustomerWithCsv", dataProviderClass = DataProvider.class)
    public void newCustomerRegistrationPositiveTest(Customer customer) {


        int i = (int) (System.currentTimeMillis() / 1000 % 3600);

        clickOnRegisterLink();

        fillRegisterLoginForm(customer);

        clickOnRegisterButton();

        Assert.assertTrue(isElementExist(), "No such element founded");
    }

}
