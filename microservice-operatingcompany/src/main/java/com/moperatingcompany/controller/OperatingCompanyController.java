package com.moperatingcompany.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public OperatingCompany findOne(@PathVariable("idOperatingCompany") Long id) {
		return iOperatingCompanyService.findOne(id);
	}

	@PostMapping("/operatingCompanies")
	public OperatingCompany save(@RequestBody OperatingCompany operatingCompany) {
		return iOperatingCompanyService.save(operatingCompany);
	}
	
	@PutMapping(value="/operatingCompanies/{id}")
	public OperatingCompany updateOperatingCompany(@PathVariable("id") long idOperatingCompany, @RequestBody OperatingCompany operatingCompany) {
		OperatingCompany currentOperatingCompany = iOperatingCompanyService.findOne(idOperatingCompany);
		currentOperatingCompany.setOperatingCompanyName(operatingCompany.getOperatingCompanyName());
		currentOperatingCompany.setIdOperatingComany(operatingCompany.getIdOperatingComany());
		currentOperatingCompany.setOperatingCompanyDetails(operatingCompany.getOperatingCompanyDetails());
		return iOperatingCompanyService.save(currentOperatingCompany);

	}

	@DeleteMapping("/operatingCompanies/{idOperatingCompany}")
	public void delete(@PathVariable("idOperatingCompany")Long id) {
		iOperatingCompanyService.delete(id);
		
	}
}
