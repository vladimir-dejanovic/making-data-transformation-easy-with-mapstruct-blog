package xyz.itshark.blog.mapstructdemo.mapstructdemo.dto;


import lombok.Data;

import java.time.LocalDate;

// some fields are renamed, some are composite
@Data
public class Customer2DTO {
    private Long id;
    private String name;
    private String familyName;
    private String fullName;
    private LocalDate birthDay;

    private String address;
    private Integer houseNumber;
    private String houseNumberAddition;
    private String city;
    private String country;
}
