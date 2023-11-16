package xyz.itshark.blog.mapstructdemo.mapstructdemo.mapper;

import xyz.itshark.blog.mapstructdemo.mapstructdemo.pojo.Customer;

public class DummyCustomerBuilder {
    public static Customer dummyCustomer() {
        Customer customer = new Customer();
        customer.setId((long)1);
        customer.setFirstName("Sherlock");
        customer.setLastName("Holmes");
        customer.setCity("London");
        customer.setCountry("Great Britan");
        customer.setHouseNumber(221);
        customer.setHouseNumberAddition("B");
        customer.setAddress("Baker Street");
        customer.setDayOfBirth(6);
        customer.setMonthOfBirth(1);
        customer.setYearOfBirth(1854);

        return customer;
    }
}
