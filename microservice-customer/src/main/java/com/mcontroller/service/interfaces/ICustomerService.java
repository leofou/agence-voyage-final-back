package com.mcontroller.service.interfaces;

import java.util.List;

import com.mcustomer.entities.Customer;

public interface ICustomerService {
	
	List<Customer> findAll();
	Customer findOne(Long id);
	Customer save(Customer customer);
	void delete(Long id);

}
