package com.clientui.proxy;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.CustomerBean;

@FeignClient(name = "microservice-customer", url = "localhost:9079/")
public interface MicroServiceCustomerProxy {

	@GetMapping(value = "/customers")
	List<CustomerBean> findAllCustomers();

	@GetMapping("/customers/{idCustomer}")
	public CustomerBean findOneCustomer(@PathParam("idCustomer") Long id);

	@PostMapping("/customers")
	public CustomerBean saveCustomer(@RequestBody CustomerBean customer);

	@PutMapping(value = "/customers/{id}")
	public CustomerBean updateCustomer(@PathVariable("id") Long id, @RequestBody CustomerBean customer);

	@DeleteMapping("/customers/{idCustomer}")
	public void deleteCustomer(@PathParam("idCustomer") Long id);

}
