package xyz.itshark.blog.mapstructdemo.mapstructdemo.dto;

import lombok.Data;

@Data
public class HomeAddressDTO {
    private String street;
    private Integer houseNumber;
    private String addition;
    private String city;
    private String country;
}
