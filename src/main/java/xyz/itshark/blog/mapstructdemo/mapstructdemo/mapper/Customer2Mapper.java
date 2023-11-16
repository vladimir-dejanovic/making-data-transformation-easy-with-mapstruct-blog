package xyz.itshark.blog.mapstructdemo.mapstructdemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.dto.Customer2DTO;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.pojo.Customer;

@Mapper
public interface Customer2Mapper {

    Customer2Mapper INSTANCE = Mappers.getMapper(Customer2Mapper.class);

    @Mapping(source = "firstName", target = "name")
    @Mapping(source = "lastName", target = "familyName")
    @Mapping(target="fullName", expression = "java(customer.getFirstName() +\" \"+ customer.getLastName())")
    @Mapping(target="birthDay", expression = "java(java.time.LocalDate.of(customer.getYearOfBirth(), customer.getMonthOfBirth(), customer.getDayOfBirth()))")
    Customer2DTO customerToCustomerDTO(Customer customer);
}
