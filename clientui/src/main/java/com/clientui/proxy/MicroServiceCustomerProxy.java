package com.clientui.proxy;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.CustomerBean;

@FeignClient(name = "microservice-customer", url = "localhost:9079/")
public interface MicroServiceCustomerProxy {

	@GetMapping(value = "/customers")
	List<CustomerBean> findAll();

	@GetMapping("/customers/{idCustomer}")
	public CustomerBean findOne(@PathParam("idCustomer") Long id);

	@PostMapping("/customers")
	public CustomerBean save(@RequestBody CustomerBean customer);

	@DeleteMapping("/customers/{idCustomer}")
	public void delete(@PathParam("idCustomer") Long id);

}
