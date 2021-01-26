package com.clientui.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.clientui.beans.OperatingCompanyBean;
import com.clientui.beans.VolBean;

@FeignClient(name="microservice-operatingcompany", url="localhost:9099/")
public interface MicroServiceOperatingCompanyProxy {
	@GetMapping(value="/operatingCompanies")
	List<OperatingCompanyBean> findAll();
}
