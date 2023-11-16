package xyz.itshark.blog.mapstructdemo.mapstructdemo.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private Integer dayOfBirth;
    @NotNull
    private Integer monthOfBirth;
    @NotNull
    private Integer yearOfBirth;
    private String address;
    private Integer houseNumber;
    private String houseNumberAddition;
    private String city;
    private String country;
}
