package com.mcustomer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcustomer.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
