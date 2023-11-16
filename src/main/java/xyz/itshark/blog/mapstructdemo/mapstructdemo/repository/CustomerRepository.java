package xyz.itshark.blog.mapstructdemo.mapstructdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.itshark.blog.mapstructdemo.mapstructdemo.pojo.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
