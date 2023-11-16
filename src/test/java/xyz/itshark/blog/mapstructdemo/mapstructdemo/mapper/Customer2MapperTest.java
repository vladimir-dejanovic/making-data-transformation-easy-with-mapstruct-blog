package xyz.itshark.blog.mapstructdemo.mapstructdemo.mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.dto.Customer2DTO;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.pojo.Customer;

import java.time.LocalDate;

public class Customer2MapperTest {
    @Test
    public void testMappingCreatedObject() {
        //given
        Customer customer = DummyCustomerBuilder.dummyCustomer();

        //when
        Customer2DTO cDto = Customer2Mapper.INSTANCE.customerToCustomerDTO(customer);

        //then
        Assertions.assertNotNull(cDto);
        Assertions.assertEquals(1, cDto.getId());
    }


    @Test
    public void testMappingName() {
        //given
        Customer customer = DummyCustomerBuilder.dummyCustomer();

        //when
        Customer2DTO cDto = Customer2Mapper.INSTANCE.customerToCustomerDTO(customer);

        //then
        Assertions.assertNotNull(cDto);
        Assertions.assertEquals("Sherlock", cDto.getName());
    }

    @Test
    public void testMappingFamilyName() {
        //given
        Customer customer = DummyCustomerBuilder.dummyCustomer();

        //when
        Customer2DTO cDto = Customer2Mapper.INSTANCE.customerToCustomerDTO(customer);

        //then
        Assertions.assertNotNull(cDto);
        Assertions.assertEquals("Holmes", cDto.getFamilyName());
    }

    @Test
    public void testMappingFullName() {
        //given
        Customer customer = DummyCustomerBuilder.dummyCustomer();

        //when
        Customer2DTO cDto = Customer2Mapper.INSTANCE.customerToCustomerDTO(customer);

        //then
        Assertions.assertNotNull(cDto);
        Assertions.assertEquals("Sherlock Holmes", cDto.getFullName());
    }

    @Test
    public void testMappingBirthDay() {
        //given
        Customer customer = DummyCustomerBuilder.dummyCustomer();

        //when
        Customer2DTO cDto = Customer2Mapper.INSTANCE.customerToCustomerDTO(customer);

        //then
        Assertions.assertNotNull(cDto);
        Assertions.assertEquals(LocalDate.of(1854,1,6), cDto.getBirthDay());
    }

}
