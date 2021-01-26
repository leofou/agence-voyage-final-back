package com.clientui.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.clientui.beans.LocationBean;

@FeignClient(name="microservice-location", url="localhost:9098/")
public interface MicroServiceLocationProxy {
	
	@GetMapping(value="/locations")
	List<LocationBean> findAll();

}
