package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domains.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
