package com.clientui.proxy;

import java.util.List;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.OperatingCompanyBean;



@FeignClient(name="microservice-operatingcompany", url="localhost:9099/")
public interface MicroServiceOperatingCompanyProxy {
	
	@GetMapping(value="/operatingCompanies")
	List<OperatingCompanyBean> findAllOperatingCompany();
	
	@GetMapping(value="/operatingCompanies/{id}")
	public OperatingCompanyBean findOneOperatingCompany(@PathVariable("id") Long id); 
	
	@PostMapping(value="/operatingCompanies")
	public OperatingCompanyBean saveOperatingCompany(@RequestBody OperatingCompanyBean operatingCompany);
	
	@PutMapping(value="/operatingCompanies/{id}")
	public OperatingCompanyBean updateOperatingCompany(@PathVariable("id") Long id, @RequestBody OperatingCompanyBean operatingCompany);
	
	@DeleteMapping(value="/operatingCompanies/{id}")
  	void deleteOperatingCompany(@PathVariable("id") Long id);
	
}
