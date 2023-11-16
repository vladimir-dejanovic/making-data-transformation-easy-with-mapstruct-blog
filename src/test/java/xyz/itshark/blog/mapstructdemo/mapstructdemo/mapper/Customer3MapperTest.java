package xyz.itshark.blog.mapstructdemo.mapstructdemo.mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.dto.Customer3DTO;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.pojo.Customer;

import java.time.LocalDate;

public class Customer3MapperTest {
    @Test
    public void testMappingCreatedObject() {
        //given
        Customer customer = DummyCustomerBuilder.dummyCustomer();

        //when
        Customer3DTO cDto = Customer3Mapper.INSTANCE.customerToCustomerDTO(customer);

        //then
        Assertions.assertNotNull(cDto);
        Assertions.assertEquals(1, cDto.getId());
    }


    @Test
    public void testMappingName() {
        //given
        Customer customer = DummyCustomerBuilder.dummyCustomer();

        //when
        Customer3DTO cDto = Customer3Mapper.INSTANCE.customerToCustomerDTO(customer);

        //then
        Assertions.assertNotNull(cDto);
        Assertions.assertEquals("Sherlock", cDto.getName());
    }

    @Test
    public void testMappingFamilyName() {
        //given
        Customer customer = DummyCustomerBuilder.dummyCustomer();

        //when
        Customer3DTO cDto = Customer3Mapper.INSTANCE.customerToCustomerDTO(customer);

        //then
        Assertions.assertNotNull(cDto);
        Assertions.assertEquals("Holmes", cDto.getFamilyName());
    }
    @Test
    public void testMappingFullName() {
        //given
        Customer customer = DummyCustomerBuilder.dummyCustomer();

        //when
        Customer3DTO cDto = Customer3Mapper.INSTANCE.customerToCustomerDTO(customer);

        //then
        Assertions.assertNotNull(cDto);
        Assertions.assertEquals("Sherlock Holmes", cDto.getFullName());
    }

    @Test
    public void testMappingBirthDay() {
        //given
        Customer customer = DummyCustomerBuilder.dummyCustomer();

        //when
        Customer3DTO cDto = Customer3Mapper.INSTANCE.customerToCustomerDTO(customer);

        //then
        Assertions.assertNotNull(cDto);
        Assertions.assertEquals(LocalDate.of(1854,1,6), cDto.getBirthDay());
    }

    @Test
    public void testMappingHomeAddress() {
        //given
        Customer customer = DummyCustomerBuilder.dummyCustomer();

        //when
        Customer3DTO cDto = Customer3Mapper.INSTANCE.customerToCustomerDTO(customer);

        //then
        Assertions.assertNotNull(cDto);
        Assertions.assertNotNull(cDto.getHomeAddress());
        Assertions.assertEquals("Baker Street",cDto.getHomeAddress().getStreet());
        Assertions.assertEquals(Integer.valueOf(221), cDto.getHomeAddress().getHouseNumber());
        Assertions.assertEquals("B",cDto.getHomeAddress().getAddition());
        Assertions.assertEquals("London", cDto.getHomeAddress().getCity());
        Assertions.assertEquals("Great Britan",cDto.getHomeAddress().getCountry());

    }

}
