package xyz.itshark.blog.mapstructdemo.mapstructdemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.dto.Customer3DTO;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.pojo.Customer;

@Mapper
public interface Customer3Mapper {

    Customer3Mapper INSTANCE = Mappers.getMapper(Customer3Mapper.class);

    @Mapping(source = "firstName", target = "name")
    @Mapping(source = "lastName", target = "familyName")
    @Mapping(target="fullName", expression = "java(customer.getFirstName() +\" \"+ customer.getLastName())")
    @Mapping(target="birthDay", expression = "java(java.time.LocalDate.of(customer.getYearOfBirth(), customer.getMonthOfBirth(), customer.getDayOfBirth()))")

    @Mapping(target="homeAddress.street",source="address")
    @Mapping(target="homeAddress.houseNumber",source="houseNumber")
    @Mapping(target="homeAddress.addition",source="houseNumberAddition")
    @Mapping(target="homeAddress.city",source="city")
    @Mapping(target="homeAddress.country",source = "country")

    Customer3DTO customerToCustomerDTO(Customer customer);
}
