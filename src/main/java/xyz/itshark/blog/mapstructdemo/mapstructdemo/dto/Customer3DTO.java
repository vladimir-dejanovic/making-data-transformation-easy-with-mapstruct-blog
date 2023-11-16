package xyz.itshark.blog.mapstructdemo.mapstructdemo.dto;


import lombok.Data;

import java.time.LocalDate;

@Data
public class Customer3DTO {
    private Long id;
    private String name;
    private String familyName;
    private String fullName;
    private LocalDate birthDay;

    private HomeAddressDTO homeAddress;
}
