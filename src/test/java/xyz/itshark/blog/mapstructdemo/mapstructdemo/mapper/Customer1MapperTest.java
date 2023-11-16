package xyz.itshark.blog.mapstructdemo.mapstructdemo.mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.dto.Customer1DTO;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.pojo.Customer;

public class Customer1MapperTest {
    @Test
    public void testMappingCreatedObject() {
        //given
        Customer customer = DummyCustomerBuilder.dummyCustomer();

        //when
        Customer1DTO cDto = Customer1Mapper.INSTANCE.customerToCustomer1DTO(customer);

        //then
        Assertions.assertNotNull(cDto);
        Assertions.assertEquals(1,cDto.getId());
    }
}
