package com.core.coreservice.repository;

import com.core.coreservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // F2EepBmbwmOtrg8o
    Customer findCustomerById(Long id);
    
}