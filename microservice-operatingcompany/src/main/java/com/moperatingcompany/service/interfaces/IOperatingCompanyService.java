package com.moperatingcompany.service.interfaces;

import java.util.List;

import com.moperatingcompany.entities.OperatingCompany;


public interface IOperatingCompanyService {
	List<OperatingCompany> findAll();
	OperatingCompany findOne(Long id);
	OperatingCompany save(OperatingCompany operatingCompany);
	void delete(Long id);
}
