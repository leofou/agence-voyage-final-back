package com.mcustomer.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public Customer findOne(@PathParam("idCustomer") Long id) {
		return iCustomerService.findOne(id);
	}

	@PostMapping("/customers")
	public Customer save(@RequestBody Customer customer) {
		return iCustomerService.save(customer);
	}

	@DeleteMapping("/customers/{idCustomer}")
	public void delete(@PathParam("idCustomer")Long id) {
		iCustomerService.delete(id);
		
	}

}
