package com.clientui.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.clientui.beans.VoyageurBean;

@FeignClient(name="microservice-voyageur", url="localhost:9094/")
public interface MicroServiceVoyageurProxy {
	
	@GetMapping(value="/voyageurs")
	List<VoyageurBean> findAll();

}
