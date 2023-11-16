package xyz.itshark.blog.mapstructdemo.mapstructdemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.dto.Customer1DTO;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.pojo.Customer;

@Mapper
public interface Customer1Mapper {

    Customer1Mapper INSTANCE = Mappers.getMapper(Customer1Mapper.class);

    Customer1DTO customerToCustomer1DTO(Customer customer);
}
