package com.mcustomer.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcustomer.entities.Customer;
import com.mcustomer.repositories.CustomerRepository;
import com.mcustomer.service.interfaces.ICustomerService;

@Service
public class CustomerService implements ICustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findOne(Long id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public Customer save(Customer vol) {
		return customerRepository.save(vol);
	}

	@Override
	public void delete(Long id) {
		customerRepository.deleteById(id);
		
	}

}
