package xyz.itshark.blog.mapstructdemo.mapstructdemo.dto;


import lombok.Data;

// Exact copy of Customer class
@Data
public class Customer1DTO {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer dayOfBirth;
    private Integer monthOfBirth;
    private Integer yearOfBirth;
    private String address;
    private Integer houseNumber;
    private String houseNumberAddition;
    private String city;
    private String country;
}
