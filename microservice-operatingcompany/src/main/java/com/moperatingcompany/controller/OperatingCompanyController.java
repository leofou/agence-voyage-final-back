package com.moperatingcompany.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moperatingcompany.entities.OperatingCompany;
import com.moperatingcompany.service.interfaces.IOperatingCompanyService;



@RestController
public class OperatingCompanyController {
	@Autowired
	IOperatingCompanyService iOperatingCompanyService;
	
	@GetMapping("/operatingCompanies")
	public List<OperatingCompany> findAll() {
		return iOperatingCompanyService.findAll();
	}

	@GetMapping("/operatingCompanies/{idOperatingCompany}")
	public OperatingCompany findOne(@PathParam("idOperatingCompany") Long id) {
		return iOperatingCompanyService.findOne(id);
	}

	@PostMapping("/operatingCompanies")
	public OperatingCompany save(@RequestBody OperatingCompany operatingCompany) {
		return iOperatingCompanyService.save(operatingCompany);
	}

	@DeleteMapping("/operatingCompanies/{idOperatingCompany}")
	public void delete(@PathParam("idOperatingCompany")Long id) {
		iOperatingCompanyService.delete(id);
		
	}
}
