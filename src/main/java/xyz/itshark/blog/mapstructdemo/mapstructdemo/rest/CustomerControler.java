package xyz.itshark.blog.mapstructdemo.mapstructdemo.rest;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.dto.Customer3DTO;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.service.CustomerService;

import java.util.List;

@RestController
public class CustomerControler {
    @Resource
    CustomerService customerService;

    @GetMapping(path="/customers")
    public List<Customer3DTO> getCustomers() {
        return customerService.findAll();
    }
}
