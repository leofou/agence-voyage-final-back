package com.clientui.proxy;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.LocationBean;

@FeignClient(name="microservice-location", url="localhost:9098/")
public interface MicroServiceLocationProxy {
	
	@GetMapping(value="/locations")
	List<LocationBean> findAll();
	
	@GetMapping("/locations/{codeLoc}")
	public LocationBean findOne(@PathParam("codeLoc") Long codeLocation);
	
	@PostMapping("/locations")
	public LocationBean save(@RequestBody LocationBean location);
	
	@DeleteMapping("/locations/{codeLoc}")
	public void delete(@PathParam("codeLoc")Long codeLocation);

}
