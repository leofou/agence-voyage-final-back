package com.mcustomer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mcustomer.entities.Customer;
import com.mcustomer.service.interfaces.ICustomerService;

@RestController
public class CustomerController {

	@Autowired
	ICustomerService iCustomerService;

	@GetMapping("/customers")
	public List<Customer> findAll() {
		return iCustomerService.findAll();
	}

	@GetMapping("/customers/{idCustomer}")
	public Customer findOne(@PathVariable("idCustomer") Long id) {
		return iCustomerService.findOne(id);
	}

	@PostMapping("/customers")
	public Customer save(@RequestBody Customer customer) {
		return iCustomerService.save(customer);
	}

	@DeleteMapping("/customers/{idCustomer}")
	public void delete(@PathVariable("idCustomer") Long id) {
		iCustomerService.delete(id);

	}

	@PutMapping(value = "/customers/{id}")
	public Customer updateCustomer(@PathVariable("id") long idCustomer, @RequestBody Customer customer) {
		Customer customer2 = iCustomerService.findOne(idCustomer);
		customer2.setCustomerName(customer.getCustomerName());
		customer2.setDateBecomeCustomer(customer.getDateBecomeCustomer());
		customer2.setEmail(customer.getEmail());
		customer2.setPhoneNumber(customer.getPhoneNumber());
		customer2.setJourneyIds(customer.getJourneyIds());
		return iCustomerService.save(customer2);

	}

}
