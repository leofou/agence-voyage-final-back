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

import com.clientui.beans.LocationBean;
import com.clientui.beans.OperatingCompanyBean;

@FeignClient(name="microservice-location", url="localhost:9098/")
public interface MicroServiceLocationProxy {
	
	@GetMapping(value="/locations")
	List<LocationBean> findAllLocations();
	
	@GetMapping("/locations/{codeLoc}")
	public LocationBean findOneLocation(@PathVariable("codeLoc") Long codeLocation);
	
	@PostMapping("/locations")
	public LocationBean saveLocation(@RequestBody LocationBean location);
	
	@DeleteMapping("/locations/{codeLoc}")
	public void deleteLocation(@PathVariable("codeLoc")Long codeLocation);
	
	@PutMapping(value="/locations/{id}")
	public LocationBean updateLocation(@PathVariable("id") Long id, @RequestBody LocationBean location);

}
