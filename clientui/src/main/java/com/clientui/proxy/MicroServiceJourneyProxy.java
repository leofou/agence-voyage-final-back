package com.clientui.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.clientui.beans.JourneyBean;

@FeignClient(name="microservice-journey", url="localhost:9078/")
public abstract interface MicroServiceJourneyProxy {
	
	@GetMapping(value="/journeys")
	List<JourneyBean> findAll();

}
