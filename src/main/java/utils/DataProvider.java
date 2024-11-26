package utils;

import models.Customer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProvider {
    @org.testng.annotations.DataProvider
    public Iterator<Object[]> newCustomerRegistration() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Usama", "Benladen", "123456789010", "boom@gmail.com", "Kabul", "9/11"});
        list.add(new Object[]{"Usama", "Benladen", "123456789010", "boom@gmail.com", "Kabul", "9/11"});
        list.add(new Object[]{"Usama", "Benladen", "123456789010", "boom@gmail.com", "Kabul", "9/11"});
        return list.iterator();
    }

    @org.testng.annotations.DataProvider
    public Iterator<Object[]> addNewCustomerWithCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/customer.csv")));
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",");

            list.add(new Object[]{new Customer().setFirstName(split[0]).setLastName(split[1]).setPassword(split[2]).setRepeatPassword(split[3]).setEmail(split[4])});
            line = reader.readLine();
        }
        return list.iterator();
    }
}
