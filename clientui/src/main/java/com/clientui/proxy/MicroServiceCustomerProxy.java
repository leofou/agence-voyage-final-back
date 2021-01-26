package com.clientui.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.clientui.beans.CustomerBean;

@FeignClient(name = "microservice-customer", url = "localhost:9079/")
public interface MicroServiceCustomerProxy {

	@GetMapping(value = "/customers")
	List<CustomerBean> findAll();

}
