package xyz.itshark.blog.mapstructdemo.mapstructdemo.service;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.dto.Customer3DTO;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.mapper.Customer3Mapper;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {

    @Resource
    CustomerRepository customerRepository;

    public List<Customer3DTO> findAll() {
        return customerRepository.findAll().stream().map(Customer3Mapper.INSTANCE::customerToCustomerDTO).toList();
    }
}
