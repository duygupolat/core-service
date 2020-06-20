package com.core.coreservice.controller;

import com.core.coreservice.entity.Customer;
import com.core.coreservice.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CustomerController {
    
    @Autowired
    CustomerService customerService;

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable String id) {

        log.info("Get [id:{}]", id);

        Customer customer = customerService.getCustomer(Long.parseLong(id));

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

}