package com.mlocation.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mlocation.entities.Location;
import com.mlocation.service.interfaces.ILocationService;

@RestController
public class LocationController {
	
	@Autowired
	ILocationService iLocationService;
	
	@GetMapping("/locations")
	public List<Location> findAll() {
		return iLocationService.findAll();
	}

	@GetMapping("/locations/{codeLoc}")
	public Location findOne(@PathVariable("codeLoc") Long codeLocation) {
		return iLocationService.findOne(codeLocation);
	}

	@PostMapping("/locations")
	public Location save(@RequestBody Location location) {
		return iLocationService.save(location);
	}

	@DeleteMapping("/locations/{codeLoc}")
	public void delete(@PathVariable("codeLoc")Long codeLocation) {
		iLocationService.delete(codeLocation);
		
	}
	
	@PutMapping(value="/operatingCompanies/{id}")
	public Location update(@PathVariable("codeLocation") Long codeLocation, @RequestBody Location location) {
		Location currentLocation = iLocationService.findOne(codeLocation);
		currentLocation.setCodeLocation(location.getCodeLocation());;
		currentLocation.setLocationName(location.getLocationName());
		currentLocation.setLocationType(location.getLocationType());
		return iLocationService.save(currentLocation);

	}

}
