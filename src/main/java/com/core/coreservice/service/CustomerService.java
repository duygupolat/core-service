package com.core.coreservice.service;

import com.core.coreservice.entity.Customer;
import com.core.coreservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    
    @Autowired
    CustomerRepository customerRepository;

    public Customer getCustomer(Long id) {

        Customer customer = customerRepository.findCustomerById(id);

        if (customer == null)
            throw new NullPointerException("No record");

        return customer;
    }
}