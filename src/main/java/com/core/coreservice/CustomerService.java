package com.core.coreservice;

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